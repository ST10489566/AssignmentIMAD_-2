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



            val Quiz = arrayOf("Q 1: Fish can blink",
                                "Q 2: Hippos sweat a red substance",
                                "Q 3: An Octopus has three hearts",
                                "Q 4: A lions's roar can travel up to eight kilometers",
                                "Q 5: Cinderella is the first Disney princess")

            val Answers = arrayOf(true,
                                         true,
                                         true,
                                         true,
                                         false  )

            var score = 0

    }
}