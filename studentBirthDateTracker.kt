data class Student(val name: String, val birthdate: String)

fun main() {
    val students = mutableListOf<Student>()

    while (true) {
        println("Student Birthdate Recording System")
        println("1. Add Student")
        println("2. View All Students")
        println("3. Exit")
        print("Enter your choice: ")

        when (readLine()?.toIntOrNull() ?: 0) {
            1 -> {
                print("Enter student's name: ")
                val name = readLine() ?: ""
                print("Enter student's birthdate (MM/DD/YYYY): ")
                val birthdate = readLine() ?: ""
                students.add(Student(name, birthdate))
                println("Student record added.")
            }
            2 -> {
                if (students.isEmpty()) {
                    println("No student records found.")
                } else {
                    println("List of Students:")
                    for (student in students) {
                        println("Name: ${student.name}, Birthdate: ${student.birthdate}")
                    }
                }
            }
            3 -> {
                println("Exiting the program.")
                return
            }
            else -> {
                println("Invalid choice. Please select a valid option.")
            }
        }
    }
}
