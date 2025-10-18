fun main() {
    val ingredients = mutableListOf<String>()

    for (i in 1..5) {
        print("Название ингредиента: ")
        val ingredient = readln().lowercase()
        ingredients.add(ingredient)
    }

    val uniqueIngredients = ingredients.distinct().sorted().toMutableList()
    uniqueIngredients[0] = uniqueIngredients[0].replaceFirstChar {
        if (it.isLowerCase()) it.titlecase() else it.toString()
    }

    println(uniqueIngredients.joinToString(separator = ", "))
}