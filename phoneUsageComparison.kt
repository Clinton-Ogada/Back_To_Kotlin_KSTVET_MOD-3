fun compareTimeSpent(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    // Use the > operator to check if timeSpentToday is greater than timeSpentYesterday.
    return timeSpentToday > timeSpentYesterday
}

fun main() {
    val timeSpentToday = 300
    val timeSpentYesterday = 250

    val result = compareTimeSpent(timeSpentToday, timeSpentYesterday)

    if (result) {
        println("You spent more time on your phone today than yesterday.")
    } else {
        println("You spent the same or less time on your phone today compared to yesterday.")
    }
}
