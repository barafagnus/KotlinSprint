package org.example.lesson_1
const val HOUR: Short = 60

fun main() {
    val seconds: Short = 6480
    val hours: Int = seconds / (HOUR * HOUR)
    val minutes: Int = seconds / HOUR

    val remainedOfMinutes: Int = minutes % HOUR
    val remainedOfSeconds: Int = seconds % HOUR
    val result: String = String.format("%02d:%02d:%02d", hours, remainedOfMinutes, remainedOfSeconds)
    println(result)
}