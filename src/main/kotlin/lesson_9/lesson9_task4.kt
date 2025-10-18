fun main() {
    print("Введите 5 ингредиентов через ', ': ")
    val ingredients = readln()

    val recipe = ingredients.split(", ").sorted()
    print(recipe)
}
