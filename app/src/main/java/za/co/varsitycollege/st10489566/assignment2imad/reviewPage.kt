package za.co.varsitycollege.st10489566.assignment2imad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
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
        val extButton = findViewById<Button>(R.id.extButton)


        val finalscore = intent.getIntExtra("score",0)
        scoreTextView.text = "Your final scor: $finalscore /5"

        val feedback = when(finalscore){
            5 ->"Exelent!!"
             4 ->  "Great"
             3 ->    "Good Job"
             2 -> "You Need More Practice"
            1 -> "Dog Water"
            else -> "Try Again Champp"
        }
        ReviewTextView.text = feedback

        extButton.setOnClickListener{
            finishAffinity()
        }

        rtrnButton.setOnClickListener{
            Toast.makeText(
                this,"Wanna go again?", Toast.LENGTH_SHORT
            ).show()

        }



    }
}