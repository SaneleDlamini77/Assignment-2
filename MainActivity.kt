package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the start button
        val startButton: Button = findViewById(R.id.startButton)

        // Set a click listener for the start button
        startButton.setOnClickListener {
            // Create an intent to start the questions
            val intent = Intent(this, QuizActivity::class.java)
            // Start the QuizActivity
            startActivity(intent)
        }
    }
}
