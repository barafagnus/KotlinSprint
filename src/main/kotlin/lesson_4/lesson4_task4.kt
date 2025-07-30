package org.example.lesson_4

fun main() {
    val day: Short = 5
    val dayIsEven: Boolean = day % 2 > 0

    println("""
        Упражнения для рук:    $dayIsEven
        Упражнения для ног:    ${!dayIsEven}
        Упражнения для спины:  ${!dayIsEven}
        Упражнения для пресса: $dayIsEven
    """.trimIndent())
}