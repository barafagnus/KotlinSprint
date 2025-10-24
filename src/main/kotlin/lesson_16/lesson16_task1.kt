package lesson_16

class Dice {
    private val number: Int = (1..6).random()

    fun getNumber(): Int = number
}

fun main() {
    val dice = Dice()
    println(dice.getNumber())
}