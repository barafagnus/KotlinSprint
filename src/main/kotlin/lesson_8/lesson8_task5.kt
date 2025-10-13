fun main() {
    print("Количество планируемых ингредиентов: ")
    val arraySize = readln().toInt()

    if (arraySize > 0) {
        val ingredients = arrayOfNulls<String>(arraySize)

        for (i in 0 until arraySize) {
            print("Что добавим: ")
            val ingredient = readln()
            ingredients[i] = ingredient
        }

        println(ingredients.joinToString(separator = ", "))
    }
}