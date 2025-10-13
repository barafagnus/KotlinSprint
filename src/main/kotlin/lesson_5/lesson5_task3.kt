package org.example.lesson_5

fun main() {
    val num1: Short = 5
    val num2: Short = 40

    print("Введите первое число от 0 до 42: ")
    val userInput1: Short = readln().toShort()
    print("Введите второе число от 0 до 42: ")
    val userInput2: Short = readln().toShort()

    if ((userInput1 == num1 && userInput2 == num2) || (userInput1 == num2 && userInput2 == num1))
        println("Поздравляем! Вы выйграли главный приз.")
    else if ((userInput1 == num1 || userInput1 == num2) || (userInput2 == num1 || userInput2 == num2))
        println("Вы выйграли утешительный приз!")
    else
        println("Неудача!")

    println("Загаданные числа: $num1 $num2")
}