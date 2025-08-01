package org.example.lesson_4

fun main() {
    val weatherIsSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val humidity: Int = 20
    val timeOfYear: String = "Winter"

    val goodConditions: Boolean = weatherIsSunny && tentIsOpen && humidity == 20 && timeOfYear != "Winter"
    println("Условия благоприятны: $goodConditions")
}