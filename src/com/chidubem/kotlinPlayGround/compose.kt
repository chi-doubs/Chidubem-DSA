package com.chidubem.kotlinPlayGround

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {




    val cupcake: (Int) -> String = {
        "Have a cupcake"
    }
   val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)

    repeat(4){
        treatFunction()
    }
    trickFunction()



}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    return if (isTrick)
        trick
    else{
        if (extraTreat != null){
            println(extraTreat(5))
        }
       return treat
    }
}
val trick = {
    println("No treats")
}

val treat: () -> Unit = {
    println("Have a treat")
}

class Song(
    val title : String,
    val artist: String,
    val yearPublished: String,
    val playCount: Int
) {
    val isPopular : Boolean
    get() = playCount >= 1000

    fun printDescription(){
        println("$title, performed by $artist, was released in $yearPublished")
    }
}
