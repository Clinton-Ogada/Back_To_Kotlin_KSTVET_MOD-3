// WITHOUT FUNCTIONS
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = (firstNumber + secondNumber) * 2000 / 45
    val anotherResult = (firstNumber + thirdNumber) * 2000 / 45
    
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// WITH FUNCTIONS
fun process(a: Int, b: Int): Double {
    return (firstNumber + secondNumber) * 2000 / 45
}

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = process(firstNumber, secondNumber)
    val anotherResult = process(firstNumber, thirdNumber)
    
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// WITH USER INPUT
fun add(a: Int, b: Int): Int {
    return firstNumber + secondNumber
}

fun main() {
    println("Enter the first number: ")
    // readLine() -> reads from the command line
    // ?. -> checks if there's anything in the command line, if nothing return null/Unit
    // toIntOrNull -> if there's a value, convert it to an integer or null(str)
    // val firstNumber = readLine() ? readLine().toIntOrNull() ? : 0
    val firstNumber = if (readLine()) readLine().toIntOrNull() else 0 // 0 is defualt value

    println("Enter the second number: ")
    val secondNumber = if (readLine()) readLine().toIntOrNull() else 0

    println("Enter the third number: ")
    val thirdNumber = if (readLine()) readLine().toIntOrNull() else 0

    val result = add(firstNumber, secondNumber)
    
    println("$firstNumber + $secondNumber = $result")
}

// CONDITIONS
fun main() {
    val age = 30
    if (age >= 18) {
        println("go and vote")
    } else {
        println("no voting")
    }

    if (age >= 18) println("go and vote") else println("no voting")
    
    if (age >= 18) ? println("go and vote") : println("no voting")

    // val firstNumber = if (readLine()) readLine().toIntOrNull() else 0
    if (readLine()) {
        val firstNumber = readLine().toIntOrNull()
    } else {
        val firstNumber = 0
    }
}

// BASIC ARITHMETIC

fun calculate(a: Int, b: Int, operator: String): Int {
    return when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> 0 // Default to 0 for unsupported operators
    }
}

fun main() {
    println("Enter the operator (+, -, *, /): ")
    val operator = readLine() ?: ""

    println("Enter the first number: ")
    val firstNumber = readLine()?.toIntOrNull() ?: 0

    println("Enter the second number: ")
    val secondNumber = readLine()?.toIntOrNull() ?: 0

    val result = calculate(firstNumber, secondNumber, operator)
    println("$firstNumber $operator $secondNumber = $result")
}
@Clinton-Ogada
