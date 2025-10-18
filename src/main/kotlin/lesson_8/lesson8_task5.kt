fun main() {
    print("Количество планируемых ингредиентов: ")
    val amount = readln().toInt()

    val ingredients = buildString {
        repeat(amount) { index ->
            print("Добавить: ")
            append(readln())
            if (index < amount - 1) append(", ")
        }
    }

    println(ingredients)
}