fun add(a: Int, b: Int): Unit {
    val result = a + b
    println("$a + $b = $result")
    // return result // output
}

fun main() {
//    GMClinton()
//    GMErick()
//    GMJohn()
   GMFriend("Clinton")
   GMFriend("Erick")
   GMFriend("John")
}

// to remove repetitive code


// fun GMClinton(): Unit {
//     println("Good morning Clinton")
// }


// fun GMErick(): Unit {
//     println("Good morning Erick")
// }

// fun GMJohn(): Unit {
//     println("Good morning John")
// }

fun GMFriend(name: String): Unit {
    println("Good morning $name")
}


// println("$a + $b = $result") // not the result -> print to the console
