package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val randomNumbers: MutableList<Int> = mutableListOf()
    val userInputs: MutableList<Int> = mutableListOf()
    val messages: MutableList<String> = mutableListOf(
        "Введите первое число от 0 до 42: ",
        "Введите второе число от 0 до 42: ",
        "Введите какое? Правильно, третье число от 0 до 42: "
    )

    for (message in messages) {
        randomNumbers.add(Random.nextInt(0, 42))
        print(message)
        userInputs.add(readln().toInt())
    }

    val numberOfMatches: Int = userInputs.intersect(randomNumbers).size

    when (numberOfMatches) {
        randomNumbers.size -> println("Вы сорвали одежду, ой... То-есть джекпот! 3/3")
        2 -> println("Крупный приз на барабане! 2/3")
        1 -> println("Утешительный приз... 1/3")
        else -> println("[Звук грустного тромбона] 0/3")
    }

    println("Загаданные числа: ${randomNumbers.joinToString(", ")}")
}