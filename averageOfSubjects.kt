fun calculateAverage(scores: List<Int>): Double {
    // Check if the 'scores' list is empty to avoid division by zero.
    if (scores.isEmpty()) {
        return 0.0
    }

    // Calculate the sum of all scores in the 'scores' list.
    val sum = scores.sum()

    // Calculate the average by dividing the sum by the number of scores.
    return sum.toDouble() / scores.size
}

fun main() {
    // Prompt the user to enter the number of subjects and store the input in 'numberOfSubjects'.
    print("Enter the number of subjects: ")
    val numberOfSubjects = readLine()?.toIntOrNull() ?: 0

    // Create an empty list 'scores' to store the scores for each subject.
    val scores = mutableListOf<Int>()

    // Loop through each subject and prompt the user to enter their score.
    for (i in 1..numberOfSubjects) {
        print("Enter the score for subject $i: ")
        // Read the user's input for the score and store it in 'score'.
        val score = readLine()?.toIntOrNull() ?: 0
        // Add the 'score' to the 'scores' list.
        scores.add(score)
    }

    // Calculate the average score by calling the 'calculateAverage' function.
    val average = calculateAverage(scores)

    // Display the calculated average score to the user.
    println("Average score: $average")
}
