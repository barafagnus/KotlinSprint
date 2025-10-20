package lesson_13

class Person(
    val name: String,
    val phone: Long,
    val company: String? = null
) {
    fun showUserInfo() {
        println("- Имя: $name\n- Телефон: $phone\n- Компания: ${company ?: "не указано"}")
    }
}

fun main() {

    val contacts = listOf<Person>(
        Person("Alex", 79000000000),
        Person("Steve", 79000000001),
        Person("Kate", 79000000002, "null"),
        Person("Serhio", 79000000003, "Reddit"),
        Person("Bob", 79000000004, "Google"),
    )

    contacts.forEach { if (it.company != null) println(it.company) }

}