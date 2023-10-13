// Define a function named 'addNumbers' with two parameters 'x' and 'y'.
fun addNumbers(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    // Call the 'addNumbers' function with different sets of arguments.
    val result1 = addNumbers(3, 5)  // '3' and '5' are arguments.
    val result2 = addNumbers(10, 7) // '10' and '7' are arguments.

    // Print the results.
    println("Result 1: $result1") // Output: Result 1: 8
    println("Result 2: $result2") // Output: Result 2: 17
}
