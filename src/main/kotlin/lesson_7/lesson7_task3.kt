fun main() {
    print("Введите число: ")
    val number = readln().toInt()

    for (num in 0..number step 2) {
        print("$num ")
    }
}