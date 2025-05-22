package com.example.assignment2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.flashcardapp.ReviewActivity

class ScoreActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n" , "NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)


        // Get the score from the intent
        val score = intent.getIntExtra("score", 0)

        // Find the score text view
        val scoreTextView: TextView = findViewById(R.id.scoreTextView)
        // Display the score
        scoreTextView.text = "Your score is $score out of ${5}."

        // Find the feedback text view
        val feedbackTextView = findViewById<TextView>(R.id.feedbackTextView)
        // Provide feedback based on the score
        val feedback = when {
            score >= 4 -> "Great job!"
            score == 3 -> "Good effort!"
            else -> "Keep practicing!"
        }
        feedbackTextView.text = feedback

        // Find the review button
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        // Set a click listener for the review button
        reviewButton.setOnClickListener {
            // Create an intent to start the ReviewActivity
            val intent = Intent(this, ReviewActivity::class.java)
            // Start the ReviewActivity
            startActivity(intent)
        }

        // Find the exit button
        val exitButton = findViewById<Button>(R.id.exitButton)
        // Set a click listener for the exit button
        exitButton.setOnClickListener {
            // Finish the activity and close the app.
            finishAffinity()

        }
    }
}
