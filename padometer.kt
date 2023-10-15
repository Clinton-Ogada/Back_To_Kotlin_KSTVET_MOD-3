fun main() {
    // Define the number of steps walked in a variable.
    val stepsWalked = 4000
    
    // Calculate the calories burned by calling the 'calculateCaloriesBurned' function.
    val caloriesBurned = calculateCaloriesBurned(stepsWalked)
    
    // Display the result, indicating the number of steps and calories burned.
    println("Walking $stepsWalked steps burns $caloriesBurned calories")
}

// Function to calculate calories burned based on the number of steps.
fun calculateCaloriesBurned(numberOfSteps: Int): Double {
    // Define the number of calories burned per step.
    val caloriesBurnedPerStep = 0.04
    
    // Calculate the total calories burned by multiplying the number of steps by calories per step.
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedPerStep
    
    // Return the total calories burned as a Double.
    return totalCaloriesBurned
}
