class Player(
    private val name: String,
    private var health: Int,
    private var power: Int
) {

    private val healingPower = 2
    private var canHeal = true

    fun takeDamage(damage: Int) {
        health -= damage
        println("hp: $health")
        if (health <= 0) death()
    }

    fun heal() {
        if (canHeal) {
            health += healingPower
            println("[HEALING] Вжух...")
            println("hp: $health")
        } else println("Труп не может себя лечить...")
    }

    private fun death() {
        power = 0
        health = 0
        canHeal = false
        println("Игрок умер")
    }

}

fun main() {
    val player = Player("Bob", 10, 2)
    player.takeDamage(5)
    player.heal()
    player.takeDamage(7)
    player.heal()
}