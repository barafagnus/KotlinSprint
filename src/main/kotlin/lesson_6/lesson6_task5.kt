import kotlin.random.Random

fun main() {
    print("Логин: ")
    val name = readln()
    print("Пароль: ")
    val password = readln()

    while (true) {
        print("Введите логин: ")
        val nameInput = readln()

        print("Введите пароль: ")
        val passwordInput = readln()

        if (nameInput == name && passwordInput == password) {
            if (captcha()) {
                break
            }

        } else println("Вы указали неверные данные")
    }
}

fun captcha(): Boolean {
    var attempts = 3
    while (attempts > 0) {
        val number1 = Random.nextInt(1, 9)
        val number2 = Random.nextInt(1, 9)
        println("Сколько будет $number1 + $number2?")
        val solution = readln().toInt()
        if (solution == number1 + number2) {
            println("Добро пожаловать!")
            return true
        } else {
            attempts -= 1
            println("Неверно")
        }
    }
    println("Доступ запрещен!")
    return false
}