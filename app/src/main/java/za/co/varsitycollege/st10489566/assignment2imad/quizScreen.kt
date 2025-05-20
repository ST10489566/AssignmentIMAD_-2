package za.co.varsitycollege.st10489566.assignment2imad

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class quizScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_screen)



            val Quiz = arrayOf("Q 1: The great wall of China is the longest wall in history",
                                "Q 2: Henry VIII had six wives",
                                "Q 3: The Industrial Revolution began in the 18th century",
                                "Q 4: The Enlightenment was a period of cultural and intellectual ferment that began in the 16th century",
                                "Q 5: Cinderella is the first Disney princess")

            val Answers = arrayOf(true,true,true,false,false)


            var score = 0

    }
}