package lesson_16

class Order(
    private val number: Int
) {

    private var status: String = "Не готов"

    private fun setStatus(newStatus: String) {
        status = newStatus
    }

    fun changeStatus(newStatus: String) {
        setStatus(newStatus)
        println("Статус заказа №$number был изменен на $newStatus")
    }

}

fun main() {
    val order = Order(1)
    order.changeStatus("Готов")
}