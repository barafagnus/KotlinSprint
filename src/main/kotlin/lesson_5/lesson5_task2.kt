package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    val userYearOfBirth = readln().toInt()
    val currentYear = LocalDate.now().year

    val resultText = if (currentYear - userYearOfBirth >= AGE_OF_MAJORITY) {
        "Show special content"
    } else if (currentYear - userYearOfBirth == 16 || currentYear - userYearOfBirth == 17) {
        "Show limited content"
    } else {
        "Back to main screen"
    }

    println(resultText)
}