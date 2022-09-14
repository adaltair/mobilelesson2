import java.util.*

//fun main(args: Array<String>) {
//    println("Hello, world!")
//}

fun main(args: Array<String>) {
//    println("Hello, ${args[0]}")

//    val isUnit = println("This is an expression")
//    println(isUnit)

//    val temperature = 10
//    val isHot = if (temperature > 50) true else false
//    println(isHot)

//    val temperature = 10
//    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
//    println(message)
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter

}
//fun feedTheFish() {
//    val day = randomDay()
//    val food = "pellets"
//    println ("Today is $day and the fish eat $food")
//}
//fun randomDay() : String {
//    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//        "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}
//
//fun fishFood (day : String) : String {
//    return when (day) {
//        "Monday" -> "flakes"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
//        "Friday" -> "mosquitoes"
//        "Sunday" -> "plankton"
//        else -> "nothing"
//    }
//}
//
//fun feedTheFish() {
//    val day = randomDay()
//    val food = fishFood(day)
//
//    println ("Today is $day and the fish eat $food")
//}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}