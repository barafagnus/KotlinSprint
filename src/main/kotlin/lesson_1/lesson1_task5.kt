package org.example.lesson_1

fun main() {
    val hour: Short = 60

    val seconds: Short = 6480
    val hours: Int = seconds / (hour * hour)
    val minutes: Int = seconds / 60

    val remainedOfMinutes: Int = minutes % 60
    val remainedOfSeconds: Int = seconds % 60
    val result: String = String.format("%02d:%02d:%02d", hours, remainedOfMinutes, remainedOfSeconds)
    println(result)
}