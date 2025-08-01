package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val presentValue = 70_000
    val interestRate = 16.7
    val numberOfInterestApplied = 1
    val timePeriods = 20

    val result = presentValue * (1 + interestRate/100 / numberOfInterestApplied).pow(numberOfInterestApplied * timePeriods)
    println(String.format("%.3f", result))
}