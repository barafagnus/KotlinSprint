fun main() {
    print("Введите количество секунд: ")
    var seconds = readln().toLong()

    while (seconds > 0) {
        println("Осталось ${seconds} секунд")
        Thread.sleep(1000)
        seconds -= 1
    }
    println("Время вышло")
}