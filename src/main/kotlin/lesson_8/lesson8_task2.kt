fun main() {
    val borschRecipe = arrayOf("говядина", "лук", "морковь", "свекла", "картофель")
    print("Поиск ингредиента: ")
    val desiredIngredient = readln().lowercase()

    for (ingredient in borschRecipe) {
        if (desiredIngredient == ingredient) {
            println("Ингредиент $desiredIngredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}