fun main() {
    val borschRecipe = arrayOf("говядина", "лук", "морковь", "свекла", "картофель")
    for (ingredient in borschRecipe) println("$ingredient ")

    print("Какой ингредиент заменим: ")
    val ingredient = borschRecipe.indexOf(readln())

    if (ingredient != -1) {
        print("Введите новый ингредиент: ")
        val newIngredient = readln()
        borschRecipe[ingredient] = newIngredient
        println("Готово! Вы сохранили следующий список ${borschRecipe.contentToString()}")
    } else println("Такого ингредиента нет")
}