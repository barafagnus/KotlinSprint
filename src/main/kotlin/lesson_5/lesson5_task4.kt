package org.example.lesson_5

fun main() {
    val login: String = "Zaphod"
    val password: String = "PanGalactic"
    lateinit var inputLogin: String
    lateinit var inputPassword: String

    print("Введите логин: ")
    inputLogin = readln()
    if (inputLogin == login) {
        print("Введите пароль: ")
        inputPassword = readln()
        if (inputPassword == password) {
            println("Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\"")
        }
    } else {
        println("Пользователь $inputLogin не найден.\nЗапускаю протокол регистрации...")
        print("Введите логин: ")
        inputLogin = readln()
        print("Введите пароль: ")
        inputPassword = readln()
        println("Пользователь $inputLogin создан... бип-буп...")
    }
}