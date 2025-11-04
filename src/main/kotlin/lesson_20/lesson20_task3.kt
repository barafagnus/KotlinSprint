class SimplePlayer(
    val name: String,
    val hasKey: Boolean
)

fun main() {
    val player = SimplePlayer("Arthur", true)

    val openDoor: (SimplePlayer) -> String = { player: SimplePlayer ->
        if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта"
    }

    println(openDoor(player))
}