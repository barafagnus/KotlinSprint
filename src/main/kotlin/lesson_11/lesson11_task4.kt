package lesson_11

class Category(
    val id: Int,
    val title: String,
    val image: String,
    val description: String,
    val recipes: List<Recipe>
)

class Recipe(
    val id: Int,
    val categoryId: Int,
    val title: String,
    val image: String,
    val ingredients: List<Ingredient>,
    val methodOfCooking: List<String>
) {

    fun calculatePortions(numberOfServings: Int = 1): List<Ingredient> {
        return ingredients.map {
            Ingredient(it.name, it.amount * numberOfServings, it.unit)
        }
    }

    fun showMethodOfCooking(): List<String> {
        return methodOfCooking.mapIndexed { index, item ->
            "${index + 1}. $item"
        }
    }

}

class Ingredient(
    val name: String,
    val amount: Float,
    val unit: String
)