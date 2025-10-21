fun main() {
    val ingredients = mutableListOf<String>()

    for (i in 1..5) {
        print("Название ингредиента: ")
        val ingredient = readln().lowercase()
        ingredients.add(ingredient)
    }

    val uniqueIngredients = ingredients.sorted().toCollection(LinkedHashSet())
    val message = uniqueIngredients.joinToString(separator = ", ").replaceFirstChar { it.uppercase() }
    println(message)

}