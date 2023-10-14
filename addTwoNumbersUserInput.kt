// Define a function named 'add' that takes two integer parameters 'a' and 'b' and returns an integer.
fun add(a: Int, b: Int): Int {
    // Calculate the sum of 'a' and 'b' and return the result.
    return a + b
}

fun main() {
    // Print a message asking the user to enter the first number.
    println("Enter the first number: ")
    // Read user input from the console and convert it to an integer (or use 0 if it's not a valid integer).
    val firstNumber = readLine()?.toIntOrNull() ?: 0

    // Print a message asking the user to enter the second number.
    println("Enter the second number: ")
    // Read user input from the console and convert it to an integer (or use 0 if it's not a valid integer).
    val secondNumber = readLine()?.toIntOrNull() ?: 0

    // Call the 'add' function with 'firstNumber' and 'secondNumber' as arguments and store the result in 'result'.
    val result = add(firstNumber, secondNumber)

    // Print the result by combining the values of 'firstNumber', 'secondNumber', and 'result'.
    println("$firstNumber + $secondNumber = $result")
}

// The following comments are not part of the code but are instructions for compiling and running the program:
// Compile the Kotlin code (YourKotlinFile.kt) and include the runtime library, and save the output as a JAR file (YourOutputJarFile.jar).
// kotlinc YourKotlinFile.kt -include-runtime -d YourOutputJarFile.jar
// Run the compiled program using the Java Virtual Machine (JVM) from the generated JAR file.
// java -jar YourOutputJarFile.jar
