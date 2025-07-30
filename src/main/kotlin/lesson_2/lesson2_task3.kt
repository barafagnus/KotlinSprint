package org.example.lesson_2

const val HOUR: Short = 60

fun main() {
    val startHours: Short = 9
    val startMinutes: Short = 39
    val startTime: Int = startHours * HOUR + startMinutes
    val travelTime: Short = 457

    val arrivalTime = startTime + travelTime
    val arrivalHours: Int = arrivalTime / HOUR
    val arrivalMinutes: Int = arrivalTime % HOUR
    val message = String.format("%02d:%02d", arrivalHours, arrivalMinutes)
    println("Время прибытия: $message")
}