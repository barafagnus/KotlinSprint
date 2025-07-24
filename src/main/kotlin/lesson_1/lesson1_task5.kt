package org.example.lesson_1

fun main() {
    val seconds: Int = 6480
    val hours: Int = seconds / 3600
    val minutes: Int = seconds / 60

    val remainderOfMinutes = minutes % 60
    val remainderOfSeconds = seconds % 60

    println("%02d:%02d:%02d".format(hours, remainderOfMinutes, remainderOfSeconds))
}