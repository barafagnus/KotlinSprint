enum class Fish(val fish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FIST("Петушок")
}

fun main() {
    Fish.entries.forEach { println(it.fish) }
}