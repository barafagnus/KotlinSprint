package org.example.lesson_2

fun main() {
    val bonus: Short = 20
    val crystals: Short = 7
    val ironOre: Short = 11

    val crystalBonus: Int = crystals * bonus / 100
    val ironOreBonus: Int = ironOre * bonus / 100
    println("+ Кристаллов: $crystalBonus")
    println("+ Железа: $ironOreBonus")

}