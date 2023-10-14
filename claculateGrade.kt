fun calculateGrade(score: Int): String {
    // Determine the grade based on the 'score' using a 'when' expression.
    return when (score) {
        in 90..100 -> "A"            // If the 'score' is between 90 and 100 (inclusive), it's an 'A.'
        in 80 until 90 -> "B"         // If the 'score' is between 80 and 89, it's a 'B.'
        in 70 until 80 -> "C"         // If the 'score' is between 70 and 79, it's a 'C.'
        in 60 until 70 -> "D"         // If the 'score' is between 60 and 69, it's a 'D.'
        else -> "F"                   // If the 'score' doesn't fall into any of the above ranges, it's an 'F' (fail).
    }
}

fun main() {
    // Prompt the user to enter their score and store the input in the 'score' variable.
    print("Enter the score: ")
    val score = readLine()?.toIntOrNull() ?: 0

    // Calculate the grade based on the entered score.
    val grade = calculateGrade(score)

    // Display the calculated grade to the user.
    println("Grade: $grade")
}
