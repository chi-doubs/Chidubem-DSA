package com.chidubem.kotlinPlayGround

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

 val cookies = listOf(
     Cookie(
         name = "Chocolate Chip",
         softBaked = false,
         hasFilling = false,
         price = 1.69
     ),
     Cookie(
         name = "Banana Walnut",
         softBaked = true,
         hasFilling = false,
         price = 1.49
     ),
     Cookie(
         name = "Vanilla Creme",
         softBaked = false,
         hasFilling = true,
         price = 1.59
     ),
     Cookie(
         name = "Chocolate Peanut Butter",
         softBaked = false,
         hasFilling = true,
         price = 1.49
     ),
     Cookie(
         name = "Snickerdoodle",
         softBaked = true,
         hasFilling = false,
         price = 1.39
     ),
     Cookie(
         name = "Blueberry Tart",
         softBaked = true,
         hasFilling = true,
         price = 1.79
     ),
     Cookie(
         name = "Sugar and Sprinkles",
         softBaked = false,
         hasFilling = false,
         price = 1.39
     )
 )
fun main(){
    //High-order functions with collections
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    val groupedMenu = cookies.groupBy { it.softBaked }
    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    val totalPrice = cookies.fold(0.0) {total, cookie->
        total + cookie.price
    }

    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Alphabetical menu:")
    alphabeticalMenu.forEach{
        println(it.name)
    }

    println("Total price: $${totalPrice}")
    println("Soft cookies:")
    softBakedMenu.forEach{
        println("${it.name} - $${it.price}")
    }

    println("Crunchy cookies:")
    crunchyMenu.forEach{
        println("${it.name} - $${it.price}")
    }
    println()
    println("Full Menu:")
        fullMenu.forEach{ println(it)}
}