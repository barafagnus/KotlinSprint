fun main() {
    print("Сколько секунд засечь: ")
    val seconds = readln().toInt()

    for (second in (seconds downTo 1)) {
        println("Осталось $second секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}