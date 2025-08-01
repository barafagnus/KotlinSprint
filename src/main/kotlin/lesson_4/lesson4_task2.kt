package org.example.lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val weight1 = 20
    val volume1 = 80

    val weight2 = 50
    val volume2 = 100

    println("Груз с весом $weight1 кг и объемом $volume1 соответствует категории 'Average': ${weight1 > minWeight && weight1 <= maxWeight && volume1 < maxVolume}")
    println("Груз с весом $weight2 кг и объемом $volume2 соответствует категории 'Average': ${weight2 > minWeight && weight2 <= maxWeight && volume2 < maxVolume}")
}