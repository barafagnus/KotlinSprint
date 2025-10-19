package lesson_11

class Category(
    val title: String,
    val image: String,
    val description: String
)


class Recipe(
    val name: String,
    val image: String,
    val ingredients: List<Ingredient>,
    val category: Category?,
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

    override fun toString(): String = """
        Recipe(
            name=$name, 
            image=$image, 
            ingredients=${ingredients.take(2)}...,
            category=${category?.title},
            methodOfCooking=${methodOfCooking[0].take(20)}...
        )
    """.trimIndent()

}


class Ingredient(
    val name: String,
    val amount: Int,
    val unit: String
) {
    override fun toString(): String {
        return "$name $amount $unit"
    }
}


class Favorites(
    val recipes: MutableList<Recipe> = mutableListOf()
) {

    fun addToFavorites(recipe: Recipe?) {
        recipe?.let { recipes.add(it) }
    }

    fun deleteFromFavorites(recipe: Recipe?) {
        recipes.remove(recipe)
    }

    fun getFavorites(): List<Any> = if (recipes.isEmpty()) {
        listOf("Вы еще не добавили ни одного рецепта в избранное")
    } else recipes

}

fun main() {

    val categories = listOf(
        Category(
            title = "Бургеры",
            image = "cat_burger.png",
            description = "Рецепты всех популярных видов бургеров"
        ),
        Category(
            title = "Десерты",
            image = "cat_dessert.png",
            description = "Самые вкусные рецепты десертов специально для вас"
        ),
        Category(
            title = "Пицца",
            image = "cat_pizza.png",
            description = "Пицца на любой вкус и цвет. Лучшая подборка для тебя"
        )
    )

    val recipes = listOf(
        Recipe(
            name = "Бургер с грибами и сыром",
            image = "mushroom_cheese_burger.png",
            ingredients = listOf(
                Ingredient(name = "Творог", amount = 350, unit = "г"),
                Ingredient(name = "Куриное яйцо", amount = 2, unit = "штуки"),
                Ingredient(name = "Пшеничная мука", amount = 6, unit = "с. ложек"),
                Ingredient(name = "Подсолнечное масло", amount = 5, unit = "с. ложек"),
                Ingredient(name = "Сахар", amount = 2, unit = "с. ложек")
            ),
            category = categories.find { it.title == "Бургеры" },
            methodOfCooking = listOf(
                "В глубокой миске смешайте говяжий фарш, лук, чеснок, соль и перец. Разделите фарш на 4 равные части и сформируйте котлеты.",
                "Разогрейте сковороду на среднем огне. Обжаривайте котлеты с каждой стороны в течение 4-5 минут или до желаемой степени прожарки.",
                "В то время как котлеты готовятся, подготовьте булочки. Разрежьте их пополам и обжарьте на сковороде до золотистой корочки.",
                "Смазать нижние половинки булочек горчицей и кетчупом, затем положите лист салата, котлету, кольца помидора и закройте верхней половинкой булочки.",
                "Подавайте бургеры горячими с картофельными чипсами или картофельным пюре."
            )
        ),
        Recipe(
            name = "Чизбургер",
            image = "cheeseburger.png",
            ingredients = listOf(
                Ingredient(name = "Булка", amount = 1, unit = "штуки"),
                Ingredient(name = "Котлета", amount = 1, unit = "штуки"),
                Ingredient(name = "Сыр", amount = 2, unit = "штуки")
            ),
            category = categories.find { it.title == "Бургеры" },
            methodOfCooking = listOf(
                "Котлету поджарить",
                "Воткнуть котлету в булку",
                "Не забыть про сыр"
            )
        ),
        Recipe(
            name = "Пипца пепперони",
            image = "pizza_pepperoni.png",
            ingredients = listOf(
                Ingredient(name = "Мука", amount = 1, unit = "штуки"),
                Ingredient(name = "Кетчуп", amount = 3, unit = "ст. ложек"),
                Ingredient(name = "Колбаса", amount = 2, unit = "штуки"),
                Ingredient(name = "Сыр", amount = 2, unit = "штуки")
            ),
            category = categories.find { it.title == "Пицца" },
            methodOfCooking = listOf(
                "Раскатать тесто в круг",
                "Добавить кетчуп, колбасу и сыр",
                "Засунуть будущую пипцу в духовку"
            )
        )
    )

    fun findRecipe(recipeName: String): Recipe? = recipes.find { it.name == recipeName }

    println("Категории:")
    categories.forEach { println("${it.image} ${it.title} ${it.description}") }
    println()


    val chosenCategory = "Бургеры"

    println("Все блюда категории $chosenCategory: ")
    recipes.forEach {
        if (it.category?.title == chosenCategory) {
            println("${it.image} ${it.name}")
        }
    }
    println()


    val chosenDish = "Бургер с грибами и сыром"

    print("Блюдо: ")
    println(findRecipe(chosenDish)?.name)
    println()

    println("Рецепт: ")
    println(
        findRecipe(chosenDish)
            ?.calculatePortions()
            ?.joinToString(separator = "\n")
    )
    println()

    println("Способ приготовления: ")
    println(
        findRecipe(chosenDish)
            ?.showMethodOfCooking()
            ?.joinToString(separator = "\n")
    )
    println()


    val favorites = Favorites()

    println("Избранное:")
    favorites.getFavorites().forEach { println(it) }
    println()

    println("Избранное после добавления:")
    favorites.addToFavorites(findRecipe("Бургер с грибами и сыром"))
    favorites.addToFavorites(findRecipe("Чизбургер"))
    favorites.getFavorites().forEach { println(it) }
    println()

    println("Избранное после удаления:")
    favorites.deleteFromFavorites(findRecipe("Бургер с грибами и сыром"))
    favorites.getFavorites().forEach { println(it) }

}

