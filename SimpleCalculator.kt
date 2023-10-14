// Define a function named "calculate" that takes two integers (a and b) and an operator (a string).
fun calculate(a: Int, b: Int, operator: String): Int {
    // Use a when expression to perform different calculations based on the provided operator.
    return when (operator) {
        "+" -> a + b  // If the operator is "+", add the two numbers.
        "-" -> a - b  // If the operator is "-", subtract the second number from the first.
        "*" -> a * b  // If the operator is "*", multiply the two numbers.
        "/" -> a / b  // If the operator is "/", divide the first number by the second.
        else -> 0     // For any other or unsupported operator, default to 0.
    }
}

fun main() {
    // Prompt the user to enter an operator and store it in the "operator" variable.
    println("Enter the operator (+, -, *, /): ")
    val operator = readLine() ?: "" // Default to an empty string if no input is provided.

    // Prompt the user to enter the first number and store it in "firstNumber."
    println("Enter the first number: ")
    val firstNumber = readLine()?.toIntOrNull() ?: 0 // Convert input to an integer; default to 0 if input is invalid.

    // Prompt the user to enter the second number and store it in "secondNumber."
    println("Enter the second number: ")
    val secondNumber = readLine()?.toIntOrNull() ?: 0 // Convert input to an integer; default to 0 if input is invalid.

    // Call the "calculate" function with the provided numbers and operator and store the result in "result."
    val result = calculate(firstNumber, secondNumber, operator)

    // Display the result of the calculation.
    println("$firstNumber $operator $secondNumber = $result")
}
