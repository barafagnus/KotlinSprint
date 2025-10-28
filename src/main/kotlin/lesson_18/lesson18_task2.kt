package lesson_18

abstract class Dice {
    abstract val range: IntRange

    open fun throwDice() {
        println("Бросаем кубик")
    }
}

class FourDice : Dice() {
    override val range = 1..4

    override fun throwDice() {
        println("Бросаем 4-гранный кубик, выпало ${range.random()}")
    }
}

class SixDice : Dice() {
    override val range = 1..6

    override fun throwDice() {
        println("Бросаем 6-гранный кубик, выпало ${range.random()}")
    }
}

class EightDice : Dice() {
    override val range = 1..8

    override fun throwDice() {
        println("Бросаем 8-гранный кубик, выпало ${range.random()}")
    }
}


fun main() {
    val dices = listOf<Dice>(
        FourDice(),
        SixDice(),
        EightDice()
    )

    dices.forEach { it.throwDice() }
}