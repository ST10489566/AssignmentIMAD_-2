package za.co.varsitycollege.st10489566.assignment2imad

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class reviewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review_page)

        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        val ReviewTextView = findViewById<TextView>(R.id.ReviewTextView)
        val rtrnButton = findViewById<Button>(R.id.rtrnButton)
        val butt....

        val score = intent.getIntExtra("score",0)
        scoreTextView.text = "Your final scor: $score /5"



    }
}