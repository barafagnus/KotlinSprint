package org.example.lesson_4

fun main() {
    val isDamaged: Boolean = true
    val numberOfCrew: Int = 70
    val numberOfFood: Int = 70
    val isGoodWeather: Boolean = true

    val canBeSent: Boolean = (!isDamaged && (numberOfCrew >= 55 || numberOfCrew <= 70) && numberOfFood > 50 && (isGoodWeather || !isGoodWeather)) || (isDamaged && numberOfCrew == 70 && isGoodWeather && numberOfFood > 50)
    println("Корабль может приступить к плаванию: $canBeSent")
}


