fun main() {
    val recipe = listOf("говядина", "лук", "морковь", "свекла", "картофель")
    println("В рецепте есть следующие ингредиенты: $recipe")

    recipe.forEach { ingredient ->
        println(ingredient)
    }
}