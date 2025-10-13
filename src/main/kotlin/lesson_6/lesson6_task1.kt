fun main() {
    print("Логин: ")
    val name = readln()
    print("Пароль: ")
    val password = readln()

    do {
        print("Введите логин: ")
        val nameInput = readln()
        print("Введите пароль: ")
        val passwordInput = readln()
    } while (nameInput != name || passwordInput != password)
    println("Авторизация прошла успешна")
}