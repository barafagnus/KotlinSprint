enum class Category {
    CLOTHING {
        override fun getText(): String = "Одежда"
    },
    STATIONERY {
        override fun getText(): String = "Канцелярские товары"
    },
    MISCELLANEOUS {
        override fun getText(): String = "Разное"
    };

    abstract fun getText(): String
}

class Product(
    val id: Int,
    val name: String,
    val category: Category
) {
    fun getProductInfo() {
        println("id: $id, название: $name, категория: ${category.getText()}")
    }
}

fun main() {
    val shirt = Product(1, "Рубашка", Category.CLOTHING)
    shirt.getProductInfo()

    val pencil = Product(2, "Карандаш", Category.STATIONERY)
    pencil.getProductInfo()
}