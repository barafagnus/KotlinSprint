fun main() {
    println("Отлично".vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = "аоуыэяеёийюaeiou"
    return this.lowercase().filter { it in vowels }.length
}