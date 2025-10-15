fun main() {
    val views = arrayOf(23, 41, 23, 0, 13, 2, 12)
    println("Просмотров за неделю: ${views.sum()}")

    // Или циклом:
    var result = 0
    for (view in views) {
        result += view
    }
    println("Просмотров за неделю: $result")
}