fun main() {
    // Declare and initialize a variable 'number' with the value 7.
    val number = 7

    // Check if 'number' is even by using the modulor operator (%). If the remainder of 'number' divided by 2 is 0, it's even.
    if (number % 2 == 0) {
        // If 'number' is even, print a message indicating that it's even.
        println("$number is even.")
    } else {
        // If 'number' is not even (i.e., it's odd), print a message indicating that it's odd.
        println("$number is odd.")
    }
}
