// Define the birthdayGreeting function that takes a name (String) and age (Int) as parameters.
fun birthdayGreeting(name: String, age: Int): String {
    // Create a personalized name greeting using string interpolation.
    val nameGreeting = "Happy Birthday, $name!"
    
    // Create an age greeting indicating the person's age using string interpolation.
    val ageGreeting = "You are now $age years old!"
    
    // Create a fixed special message.
    val specialMessage = "You're simply adorable"
    
    // Combine the nameGreeting, ageGreeting, and specialMessage into a single string
    // with newline characters separating each part.
    val fullMessage = "$nameGreeting\n$ageGreeting\n$specialMessage"
    
    // Return the full birthday message as a string.
    return fullMessage
}
fun main() {
    // Call the birthdayGreeting function with "Love" as the name and 30 as the age.
    println(birthdayGreeting("Love", 30))
}
