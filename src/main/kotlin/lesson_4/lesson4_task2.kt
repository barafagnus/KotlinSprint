package org.example.lesson_4

fun main() {
    val minWeight: Short = 35
    val maxWeight: Short = 100
    val maxVolume: Short = 100

    val weight1: Short = 20
    val volume1: Short = 80

    val weight2: Short = 50
    val volume2: Short = 100

    println("Груз с весом $weight1 кг и объемом $volume1 соответствует категории 'Average': ${weight1 > minWeight && weight1 <= maxWeight && volume1 < maxVolume}")
    println("Груз с весом $weight2 кг и объемом $volume2 соответствует категории 'Average': ${weight2 > minWeight && weight2 <= maxWeight && volume2 < maxVolume}")
}