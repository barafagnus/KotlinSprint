fun main() {
    val borschRecipe = arrayOf("говядина", "лук", "морковь", "свекла", "картофель")
    for (ingredient in borschRecipe) println("$ingredient ")

    print("Какой ингредиент заменим: ")
    val ingredient = readln()

    if (ingredient in borschRecipe) {
        print("Введите новый ингредиент: ")
        val newIngredient = readln()
        borschRecipe[borschRecipe.indexOf(ingredient)] = newIngredient
        println("Готово! Вы сохранили следующий список ${borschRecipe.contentToString()}")
    } else println("Такого ингредиента нет")
}