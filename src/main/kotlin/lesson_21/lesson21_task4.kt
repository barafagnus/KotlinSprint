package lesson_21

import java.io.File

fun main() {
    val file = File("words.txt")

    file.writeToBeginning("Skyscraper")
    file.writeToBeginning("Bird")
}

fun File.writeToBeginning(text: String) {
    val content = if (exists()) readText() else ""
    writeText("${text.lowercase()}\n$content")
}