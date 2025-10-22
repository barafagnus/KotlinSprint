fun main() {
    val player = rollTheDice()
    val computer = rollTheDice()

    when {
        player > computer -> println("Победило человечество")
        computer > player -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

private val DICE_RANGE = 1..6
private fun rollTheDice(): Int = DICE_RANGE.random()