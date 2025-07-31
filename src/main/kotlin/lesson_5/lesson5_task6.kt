package org.example.lesson_5

import kotlin.math.pow

const val METER = 100

fun main() {
    print("Введит вес (кг): ")
    val weight: Double = readln().toDouble()
    print("Введите рост (см): ")
    val height: Double = readln().toDouble() / METER
    val heightWeightIndex: Double = weight / height.pow(2)

    if (heightWeightIndex < 18.5) println("Недостаточная масса тела")
    else if (heightWeightIndex in 18.5..<25.0) println("Нормальная масса тела")
    else if (heightWeightIndex in 25.0..<30.0) println("Избыточная масса тела")
    else if (heightWeightIndex >= 30) println("Ожирение")
    println("ИМТ составил: ${String.format("%.2f", heightWeightIndex)}")
}