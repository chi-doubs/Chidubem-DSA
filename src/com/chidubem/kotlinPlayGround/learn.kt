package com.chidubem.kotlinPlayGround


// class for the FillInTheBlankQuestion
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficultly: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}

interface ProgressPrintable{
    val progressText: String
    fun printProgressBar()

}

class Quiz :  ProgressPrintable {

    override val progressText: String
        get() = "$answered of $total answered"

    override fun printProgressBar() {
        repeat(answered){ print("▓") }
        repeat(total - answered) { print("▒") }
        println()
        println(progressText)
    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficultly)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficultly)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficultly)
        }
        println()
    }
    val question1 = Question<String>("Quoth the raven___", "nevemore",Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The Sky is Green. True or false", false ,Difficulty.EASY)
    val question3 = Question<Int>("How many days are between full moons?", 28 ,Difficulty.HARD)

    companion object StudentProgress{
        var total: Int = 10
        var answered: Int = 3
    }

}



fun main() {
    Quiz().apply {
        printQuiz()
    }

    Quiz().printProgressBar()
}