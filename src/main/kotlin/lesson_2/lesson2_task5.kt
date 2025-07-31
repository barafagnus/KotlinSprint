package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val presentValue: Int = 70_000
    val interestRate: Float = 16.7f
    val numberOfInterestApplied: Short = 1
    val timePeriods: Short = 20

    val result: Float = presentValue * (1 + (interestRate/100) / numberOfInterestApplied).pow(numberOfInterestApplied * timePeriods)
    println(String.format("%.3f", result))
}