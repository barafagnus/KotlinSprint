val NUMS = (1..6)

fun main() {
    val player = rollTheDice()
    val computer = rollTheDice()

    when {
        player > computer -> println("Победило человечество")
        computer > player -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

fun rollTheDice(): Int = NUMS.random()