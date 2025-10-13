fun main() {
    var randomNumber = (1000..9999).random()
    println("Ваш код авторизации: $randomNumber")

    while (true) {
        print("Введите код авторизации: ")
        val code = readln().toInt()
        if (code == randomNumber) {
            println("Добро пожаловать")
            break

        } else {
            randomNumber = (1000..9999).random()
            println("Ваш код авторизации: $randomNumber")
        }
    }
}