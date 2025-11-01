enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FIST
}

fun main() {
    Fish.entries.forEach { println(it) }
}