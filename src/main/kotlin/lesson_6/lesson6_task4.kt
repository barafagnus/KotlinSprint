fun main() {
    var attempts = 5
    val number = (1..9).random()
    do {
        print("${number} Введите число: ")
        val choice = readln().toInt()
        if (choice == number) {
            println("Это была великолепная игра!")
            break
        } else {
            --attempts
            println("Неверно. Попыток осталось $attempts")
        }
    } while (attempts > 0)
    print("Было загадано число $number")
}