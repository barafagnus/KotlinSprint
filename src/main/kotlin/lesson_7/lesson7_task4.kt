fun main() {
    print("Сколько секунд засечь: ")
    val seconds = readln().toInt()

    for (second in seconds downTo 1) {
        Thread.sleep(1000)
        println("Осталось $second секунд")
    }
    println("Время вышло")
}