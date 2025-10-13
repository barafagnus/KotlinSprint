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
            println("Авторизация прошла успешна")
            break
        } else println("Вы указали неверные данные")
    }
}