fun main() {
    do {
        val randomNumber = (1000..9999).random()
        println("Ваш код авторизации: $randomNumber")
        print("Введите код авторизации: ")
        val code = readln().toInt()
    } while (code != randomNumber)

    println("Добро пожаловать")
}