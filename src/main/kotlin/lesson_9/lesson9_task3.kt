fun main() {
    var recipe: List<Int> = mutableListOf(2, 50, 15)
    print("Количество порций: ")
    val amount = readln().toInt()

    recipe = recipe.map { it * amount }

    print(
        """
        На $amount порций вам понадобится:
        Яиц - ${recipe.get(0)}, молока - ${recipe.get(1)}, сливочного масла - ${recipe.get(2)}
    """.trimIndent()
    )
}