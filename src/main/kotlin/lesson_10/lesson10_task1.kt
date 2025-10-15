fun main() {
    val player = rollTheDice()
    val computer = rollTheDice()

    when {
        player > computer -> println("Победило человечество")
        computer > player -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

val DICE_RANGE = 1..6
fun rollTheDice(): Int = DICE_RANGE.random()