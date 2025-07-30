package org.example.lesson_3

fun main() {
    val firstName: String = "Татьяна"
    var lastName: String = "Андреева"
    val middleName: String = "Сергеевна"
    var age: Short = 20
    println("$lastName $firstName $middleName, $age")

    lastName = "Сидорова"
    age = 22
    println("$lastName $firstName $middleName, $age")
}