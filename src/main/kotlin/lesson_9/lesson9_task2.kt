fun main() {
    val recipe = mutableListOf("яйцо", "молоко", "соль")
    println("В рецепте есть базовые ингредиенты: $recipe")
    while (true) {
        print("Желаете добавить еще? >> ")
        val answer = readln()
        if (answer.equals("да", ignoreCase = true)) {
            print("Какой ингредиент вы хотите добавить? >> ")
            val ingredient = readln().lowercase()
            recipe.add(ingredient)
            println("Теперь в рецепте есть следующие ингредиенты: $recipe")
        } else break
    }
}