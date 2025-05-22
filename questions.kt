@file:Suppress("UNUSED_VARIABLE")

package com.example.assignment2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    // Declare variables for the questions, answers, current question index, and score
    private val questions = arrayOf(
        "Elephants are the largest animals" ,
        "South Africa won the World Cup in 2010" ,
        "The sun is a giant ball of fire" ,
        "The capital of South Africa is Johannesburg" ,
        "Every human has 32 teeth"
    )
    private val answers = booleanArrayOf(true, false, false, true, true)
    private var currentQuestionIndex = 0
    private var score = 0

    // Declare UI elements
    private lateinit var questionTextView: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button
    private lateinit var resultTextView: TextView  // Added for feedback

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        // Initialize UI elements
        val questionsTextView =findViewById<TextView>(R.id.questionsText)
        val trueButton = findViewById<Button>(R.id.trueButton)
        val falseButton = findViewById<Button>(R.id.falseButton)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView) //find the new TextView

        // Display the first question
        displayQuestion()

        // Set click listeners for the true and false buttons
        trueButton.setOnClickListener {
            checkAnswer(true)
        }
        falseButton.setOnClickListener {
            checkAnswer(false)
        }

        // Set a click listener for the next button
        nextButton.setOnClickListener {
            // Move to the next question or finish the quiz
            if (currentQuestionIndex < questions.size - 1) {
                currentQuestionIndex++
                displayQuestion()
                resultTextView.text = "" // Clear result text
                enableButtons() // Enable buttons for the next question
            } else {
                // If all questions have been answered, go to the score activity
                val intent = Intent(this, score::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish() //prevent back button
            }
        }
    }

    // Function to display the current question
    private fun displayQuestion() {
        questionTextView.text = questions[currentQuestionIndex]
        nextButton.isEnabled = false // Disable next button until an answer is given.
    }

    // Function to check the answer and update the score
    @SuppressLint("SetTextI18n")
    private fun checkAnswer(userAnswer: Boolean) {
        if (userAnswer == answers[currentQuestionIndex]) {
            score++
            resultTextView.text = "Correct!"
        } else {
            resultTextView.text = "Incorrect!"
        }
        disableButtons() // Disable buttons after an answer
        nextButton.isEnabled = true // Enable the next button after an answer
    }

    // Function to disable the true and false buttons
    private fun disableButtons() {
        trueButton.isEnabled = false
        falseButton.isEnabled = false
    }

    // Function to enable the true and false buttons
    private fun enableButtons() {
        trueButton.isEnabled = true
        falseButton.isEnabled = true
    }
}



