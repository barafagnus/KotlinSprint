fun main() {
    print("Введите количество секунд: ")
    val seconds = readln().toLong()

    Thread.sleep(seconds * 1000)
    println("Прошло ${seconds} секунд")
}