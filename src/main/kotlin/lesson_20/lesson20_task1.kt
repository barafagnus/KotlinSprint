fun main() {
    val message: (String) -> String = { name: String -> "С наступающим Новым Годом, $name!" }
    println(message("Вася"))
}