# Assignment-2
# Flashcard Quiz App

![Flashcard Quiz App Screenshots](screenshots/screenshot.png)

A native Android app built with Kotlin that helps users study with flashcards. The app presents true/false questions, loops through each flashcard, and provides a score based on the user's answers.

## Features

- Welcome screen with app description
- Quiz screen with true/false questions
- Immediate feedback for each answer
- Score summary at the end
- Option to review correct answers
- Clean and intuitive UI

## Screens

1. **Welcome Screen**:
   - Displays app description
   - Start button begins the quiz

2. **Quiz Screen**:
   - Shows one question at a time
   - True/False answer buttons
   - Immediate feedback (Correct/Incorrect)
   - Next button progresses through questions

3. **Score Screen**:
   - Displays final score (e.g., 3/5)
   - Personalized feedback based on score
   - Review button to see correct answers
   - Exit button to close the app

## Technical Details

- Built with Kotlin in Android Studio
- Uses three activities:
  - `MainActivity`: Welcome screen
  - `QuizActivity`: Quiz logic and display
  - `ScoreActivity`: Score summary
- Parallel arrays store questions and answers
- Intent system for navigation between screens
- GitHub Actions for CI/CD

## Getting Started

1. Clone this repository
2. Open in Android Studio
3. Build and run on an emulator or physical device

## Requirements

- Android 5.0 (API 21) or higher
- Android Studio (latest version recommended)

## Future Enhancements

- Add multiple question types
- Implement a database for questions
- Add user accounts and score tracking
- Include images with questions
- Add animations and transitions

  The Flashcard Quiz App is a simple educational tool designed to help users test their knowledge through true/false questions. The app guides users through three distinct screens, providing immediate feedback and a final score summary.

Key Components
Welcome Screen (MainActivity.kt):

First screen users see when opening the app

Provides a brief description of the app's purpose

Contains a "Start" button that begins the quiz

Quiz Screen (QuizActivity.kt):

Displays one question at a time from a predefined set

Offers "True" and "False" buttons for answering

Shows immediate feedback after each answer

Tracks the user's score (1 point per correct answer)

Includes a "Next" button to progress through questions

Score Screen (ScoreActivity.kt):

Shows the final score (e.g., "4/5")

Provides personalized feedback based on performance

Offers a "Review" button to see correct answers

Includes an "Exit" button to close the app

Technical Implementation
Data Storage:

Questions and answers stored in parallel arrays

Questions in res/values/strings.xml for easy localization

Navigation:

Uses Android's Intent system to move between activities

Passes score data between activities using Intent extras

UI Design:

Clean, simple layouts using LinearLayout

Appropriate text sizes and spacing for readability

Disabled buttons when not applicable to guide user flow

Logic Flow:

Tracks current question index to progress through quiz

Compares user answers against correct answers

Calculates final score and provides feedback

GitHub Integration
Repository contains all source code and resources

GitHub Actions workflow for continuous integration:

Runs on every push/pull request

Sets up JDK 11

Builds the project with Gradle

README.md provides comprehensive project documentation

Educational Value
This app demonstrates several fundamental Android development concepts:

Activity lifecycle

UI design with XML layouts

Event handling with button clicks

Navigation between screens

Data passing between activities

Resource management (strings.xml)

Basic app architecture
