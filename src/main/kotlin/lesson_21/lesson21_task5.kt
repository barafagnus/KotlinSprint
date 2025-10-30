fun main() {
    val spells = mapOf<String, Int>(
        "Summoning imp" to 10,
        "Fireball" to 60,
        "Ice dagger" to 60,
        "Holy Shield" to 20
    )

    println(spells.maxCategory())
}

fun Map<String, Int>.maxCategory(): String = this.maxBy { it.value }.key
