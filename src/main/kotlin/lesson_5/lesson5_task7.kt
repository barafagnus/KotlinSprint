package org.example.lesson_5

fun main() {
    print("Расстояние поездки (км): ")
    val distance: Float = readln().toFloat()
    print("Расход топлива на 100 км (л): ")
    val fuelConsumption: Float = readln().toFloat()
    print("Текущая цена за литр топлива: ")
    val fuelPrice: Float = readln().toFloat()

    val fuelTotalVolume: Float = (distance * fuelConsumption) / 100
    val fuelTotalPrice: Float = fuelTotalVolume * fuelPrice

    println("Общее количество необходимого топлива (л): ${String.format("%.2f", fuelTotalVolume)}")
    println("Итоговая стоимость поездки: ${String.format("%.2f", fuelTotalPrice)}")
}