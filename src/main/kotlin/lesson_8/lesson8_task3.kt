fun main() {
    val borschRecipe = arrayOf("говядина", "лук", "морковь", "свекла", "картофель")

    print("Поиск ингредиента: ")
    val desiredIngredient = readln().lowercase()

    if (desiredIngredient in borschRecipe) {
        println("Ингредиент $desiredIngredient в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}
