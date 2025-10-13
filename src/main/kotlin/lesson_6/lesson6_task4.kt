import kotlin.random.Random


fun main() {
    var attempts = 3
    val number = Random.nextInt(1, 5)
    while (attempts > 0) {
        print("Введите число: ")
        val choice = readln().toInt()
        if (choice == number) {
            println("Это была великолепная игра!")
            break
        } else {
            attempts -= 1
            println("Неверно. Попыток осталось $attempts")
        }
    }
    print("Было загадано число $number")
}