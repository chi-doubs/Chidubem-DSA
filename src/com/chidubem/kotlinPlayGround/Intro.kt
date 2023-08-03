package com.chidubem.kotlinPlayGround

fun main() {
//    println("Hello, World!")
//    println("Hello, Android")
//    println("Tomorrow is rainy")

    val count: Int = 10
   println("You have $count unread messages.")

    val unreadCount = 5
    val readCount = 100
   println(" $readCount photos")
    println("You have ${unreadCount + readCount} total messages in your inbox")

    var cartTotal = 0
    cartTotal += 20
//    println("Total: $cartTotal")

//    println("Happy Birthday, Rover")
//    println("You are now 5 years old")

    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)

    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val case = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println(case)

    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

    println(birthdayGreeting( age = 4))
    println(birthdayGreeting("Rex", 3))

    val operatingSystem = "ChromeOS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))

    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")

    println(compareTwoNumbers(220, 200))
    println(compareTwoNumbers(220, 300))

    println(climate("Tokyo", 32, 36, 10))
}

fun compareTwoNumbers(timeSpentToday: Int, timeSpentYesterday: Int) : Boolean{
    if (timeSpentToday > timeSpentYesterday) return true
    return false
}

fun climate(city : String, lowTemp: Int, highTemp: Int, chance: Int ): String{
    val location = "City: $city"
    val temp  = "Low temperature: $lowTemp, High Temperature: $highTemp"
    val rainChances = "Chance of rain: $chance%"
    return "$location\n$temp\n$rainChances"
}
fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    return numberOfSteps * caloriesBurnedForEachStep
}

fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId "
}

fun birthdayGreeting(name : String = "Rover", age: Int) : String {
//    println("Happy Birthday, Rover!")
//    println("You are now 5 years old")
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun add(firstVal: Int, secondVal: Int): Int{
    return firstVal + secondVal;
}

fun subtract(firstVal: Int, secondVal: Int): Int {
    return firstVal - secondVal;
}
