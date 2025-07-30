package org.example.lesson_3

fun main() {
    val playersMove: String = "D2-D4;0"
    val result: List<String> = playersMove.split("[-;]".toRegex())
    val from: String = result[0]
    val to: String = result[1]
    val moveNumber: String = result[2]
    println(from)
    println(to)
    println(moveNumber)
}