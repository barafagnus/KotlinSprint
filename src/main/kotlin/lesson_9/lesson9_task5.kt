fun main() {
    val ingredients = mutableListOf<String>()

    for (i in 1..5) {
        print("Название ингредиента: ")
        val ingredient = readln()
        ingredients.add(ingredient)
    }

    ingredients.sort()
    ingredients[0] = ingredients.get(0).replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    val uniqueIngredients = ingredients.toCollection(LinkedHashSet())
    print(uniqueIngredients.joinToString(separator = ", "))
}