package lesson_13

class User(
    val name: String,
    val phone: Long,
    val company: String? = null
) {
    fun showUserInfo() {
        println("- Имя: $name\n- Телефон: $phone\n- Компания: ${company ?: "не указано"}")
    }
}

fun main() {

    val contact = User(
        name = "Alex",
        phone = 79123456789,
        null
    )

    contact.showUserInfo()

}