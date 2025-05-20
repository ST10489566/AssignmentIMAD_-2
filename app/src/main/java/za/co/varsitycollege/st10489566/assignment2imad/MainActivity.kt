package za.co.varsitycollege.st10489566.assignment2imad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener{
            Toast.makeText(
                this@MainActivity,
                "Flash cards started",Toast.LENGTH_LONG
            ).show()

            val intent = Intent(this, quizScreen::class.java)
            startActivity(intent)
        }
    }
}