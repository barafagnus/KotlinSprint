package org.example.lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    val weight1 = 20
    val volume1 = 80

    val weight2 = 50
    val volume2 = 100

    val firstCargoIsAverage = weight1 > MIN_WEIGHT && weight1 <= MAX_WEIGHT && volume1 < MAX_VOLUME
    val secondCargoIsAverage = weight2 > MIN_WEIGHT && weight2 <= MAX_WEIGHT && volume2 < MAX_VOLUME

    println("Груз с весом $weight1 кг и объемом $volume1 соответствует категории 'Average': $firstCargoIsAverage")
    println("Груз с весом $weight2 кг и объемом $volume2 соответствует категории 'Average': $secondCargoIsAverage")
}