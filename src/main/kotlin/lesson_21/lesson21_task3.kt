class PlayerHero(
    val name: String,
    val currentHealth: Int,
    val maxHealth: Int
)

fun PlayerHero.isHealthy(): Boolean {
    return this.currentHealth == maxHealth
}