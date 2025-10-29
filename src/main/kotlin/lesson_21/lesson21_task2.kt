fun main() {
    val someList = listOf<Int>(1, 2, 3, 4, 5)
    println(someList.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}