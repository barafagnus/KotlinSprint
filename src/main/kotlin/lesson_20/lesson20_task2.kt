class Hero(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun main() {
    val hero = Hero("Arthur", 50, 100)
    println("${hero.name}: ${hero.currentHealth} hp")

    val drinkHealthPotion: (Hero) -> Unit = { hero: Hero ->
        hero.currentHealth = hero.maxHealth
    }

    drinkHealthPotion(hero)
    println("${hero.name}: ${hero.currentHealth} hp")
}