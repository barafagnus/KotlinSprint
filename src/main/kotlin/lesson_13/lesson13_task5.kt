package lesson_13

class PhContact(
    val name: String,
    val phone: Long?,
    val company: String? = null
) {
    fun showUserInfo() {
        println("- Имя: $name\n- Телефон: $phone\n- Компания: ${company ?: "не указано"}")
    }
}

fun main() {
    val contacts = listOf<PhContact>(
        PhContact("Alex", 79000000000),
        PhContact("Steve", 79000000001),
        PhContact("Kate", 79000000002, "null"),
        PhContact("Serhio", 79000000003, "Reddit"),
        PhContact("Bob", 79000000004, "Google"),
    )

    val phoneNumber = try {
        print("Введите номер: ")
        readLine()?.toLong()

    } catch (e: NumberFormatException) {
        println(e.javaClass.simpleName)
        print("Введите номер: ")
        readLine()?.filter { it.isDigit() }?.toLongOrNull()
    }

    contacts.find { it.phone == phoneNumber }?.showUserInfo()

}