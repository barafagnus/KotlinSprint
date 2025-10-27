class Order(
    val number: Int
) {
    private var items: Any? = null

    fun getOrderInfo(item: String) {
        items = item
        println("Заказан товар: $items")
    }

    fun getOrderInfo(itemList: List<String>) {
        items = itemList
        println("Заказаны следующие товары: $items")
    }
}

fun main() {
    val order = Order(1)
    order.getOrderInfo("Картофель")

    val order2 = Order(2)
    order2.getOrderInfo(listOf("Мясо", "Лук"))
}