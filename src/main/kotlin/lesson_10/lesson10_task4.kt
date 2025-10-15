fun main() {
    var winnings = 0

    do {
        val player = rollTheDice()
        val computer = rollTheDice()

        when {
            player > computer -> {
                println("Победило человечество")
                winnings++
            }

            computer > player -> println("Победила машина")
            else -> println("Победила дружба")
        }
    } while (startRound())

    println("Партий выйграно: $winnings")
}


val DICE_RANGE = 1..6
fun rollTheDice(): Int = DICE_RANGE.random()

fun startRound(): Boolean {
    while (true) {
        print("Хотите бросить кости еще раз? ")
        when (readln().lowercase()) {
            "да" -> return true
            "нет" -> return false
            else -> {
                println("Некорректный ввод. Введите 'да'/'нет'")
            }
        }
    }
}