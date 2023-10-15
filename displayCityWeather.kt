// Define a function to display weather information for a city.
fun displayCityWeather(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    // Print the name of the city.
    println("City: $city")

    // Print the low and high temperatures for the day.
    println("Low temperature: $lowTemp, High temperature: $highTemp")

    // Print the chance of rain as a percentage.
    println("Chance of rain: $chanceOfRain%")

    // Print an empty line to separate city weather information.
    println()
}

// Main function to display weather information for multiple cities.
fun main() {
    // Call the displayCityWeather function for each city with its weather details.
    displayCityWeather("Ankara", 27, 31, 82)
    displayCityWeather("Tokyo", 32, 36, 10)
    displayCityWeather("Cape Town", 59, 64, 2)
    displayCityWeather("Guatemala City", 50, 55, 7)
}
