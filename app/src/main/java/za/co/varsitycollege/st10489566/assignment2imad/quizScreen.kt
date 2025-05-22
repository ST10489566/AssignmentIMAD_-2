package za.co.varsitycollege.st10489566.assignment2imad

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class quizScreen : AppCompatActivity() {

    private lateinit var quizTextView: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var rstButton: Button

     val quiz = arrayOf(
        "Q1: The Great Wall of China is the longest wall in history",
        "Q2: Henry VIII had six wives",
        "Q3: The Industrial Revolution began in the 18th century",
        "Q4: The Enlightenment began in the 16th century",
        "Q5: Cinderella is the first Disney princess"
    )

     val answers = arrayOf(true, true, true, false, false)

     var currentQuestionIndex = 0
     var score = 0
     val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_screen)


        quizTextView = findViewById(R.id.quizTextView)
        trueButton = findViewById(R.id.trueButton)
        falseButton = findViewById(R.id.falseButton)
        rstButton = findViewById(R.id.rstButton)

        showQuiz()

        trueButton.setOnClickListener {
            checkAnswer(true)
        }

        falseButton.setOnClickListener {
            checkAnswer(false)
        }



        rstButton.setOnClickListener {
            resetQuiz()
        }
    }

    // Displays current question (first question)
    @SuppressLint("SetTextI18n")
     fun showQuiz() {
        if (currentQuestionIndex < quiz.size) {
            quizTextView.text = quiz[currentQuestionIndex]
            trueButton.isEnabled = true
            falseButton.isEnabled = true
        } else {
            quizTextView.text = "Completed Quiz!"
        }
    }

    // Checks user answer
     fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = answers[currentQuestionIndex]
        if (userAnswer == correctAnswer) {
            score++
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show()
        }

        trueButton.isEnabled = false
        falseButton.isEnabled = false

        // Move to next question after 1 second
        handler.postDelayed({
            nextQuestion()
        }, 1000)
    }

    // Moves to next question or ends quiz
     fun nextQuestion() {
        currentQuestionIndex++
        if (currentQuestionIndex < quiz.size) {
            showQuiz()
        } else {
            // Quiz finished
            val intent = Intent(this, reviewPage::class.java)
            intent.putExtra("Score", score)
            startActivity(intent)
            finish()
        }
    }

    // Resets the quiz and start over
     fun resetQuiz() {
        score = 0
        currentQuestionIndex = 0
        showQuiz()
        Toast.makeText(this, "Quiz restarted", Toast.LENGTH_SHORT).show()
    }
}
