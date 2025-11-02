enum class Category {
    CLOTHING,
    STATIONERY,
    MISCELLANEOUS;

    fun getCategoryName() = when (this) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        MISCELLANEOUS -> "Разное"
    }

}

class Product(
    val id: Int,
    val name: String,
    val category: Category
) {
    fun getProductInfo() {
        println("id: $id, название: $name, категория: ${category.getCategoryName()}")
    }
}

fun main() {
    val shirt = Product(1, "Рубашка", Category.CLOTHING)
    shirt.getProductInfo()

    val pencil = Product(2, "Карандаш", Category.STATIONERY)
    pencil.getProductInfo()
}