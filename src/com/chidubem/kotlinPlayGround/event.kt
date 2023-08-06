package com.chidubem.kotlinPlayGround

import java.time.Duration

// data class
data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val durationInMinutes: Int
)

 enum class DayPart {
     MORNING , AFTERNOON, EVENING
}

val event1 = Event(title = "Wake up", description = "Time to get up", dayPart = DayPart.MORNING, durationInMinutes = 0)
val event2 = Event(title = "Eat breakfast", dayPart = DayPart.MORNING, durationInMinutes = 15)
val event3 = Event(title = "Learn about Kotlin", dayPart = DayPart.AFTERNOON, durationInMinutes = 30)
val event4 = Event(title = "Practice Compose", dayPart = DayPart.AFTERNOON, durationInMinutes = 60)
val event5 = Event(title = "Watch latest DevBytes video", dayPart = DayPart.AFTERNOON, durationInMinutes = 10)
val event6 = Event(title = "Check out latest Android Jetpack library", dayPart = DayPart.EVENING, durationInMinutes = 45)



fun main(){
    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    val timeDuration = events.filter {
         it.durationInMinutes < 60
    }

    val groupedEvents = events.groupBy { it.dayPart }
    groupedEvents.forEach{ (day, events) ->
        println("$day: ${events.size} events")
    }

    println("You have ${timeDuration.size} short events.")
}