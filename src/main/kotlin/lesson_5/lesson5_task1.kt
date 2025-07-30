package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val randVal: Int = Random.Default.nextInt(1, 100)
    val randVal2: Int = Random.Default.nextInt(1, 100)
    print("Сколько будет $randVal + $randVal2: ")
    val inp: Int = readln().toInt()
    if (inp == randVal + randVal2) println("Добро пожаловать.") else println("Доступ запрещен.")
}