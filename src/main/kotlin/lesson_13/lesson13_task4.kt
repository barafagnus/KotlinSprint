package lesson_13

class PhoneContact(
    val name: String,
    val phone: Long?,
    val company: String? = null
) {
    fun showUserInfo() {
        println("- Имя: $name\n- Телефон: $phone\n- Компания: ${company ?: "не указано"}")
    }
}

fun main() {

    val phoneBook = mutableListOf<PhoneContact>()

    do {

        print("Имя: ")
        val name = readln()

        print("Телефон: ")
        val phone = readLine()?.toLongOrNull()

        print("Компания: ")
        val company = readLine()

        if (phone == null) {
            println("Запись не будет добавлена, т.к. вы не ввели номер телефона")
        } else {
            println("Запись добавлена")
            phoneBook.add(PhoneContact(name = name, phone = phone, company = company))
        }

        println("Добавим еще контакт? да/нет: ")
        val addContact = readln().lowercase()

    } while (addContact == "да")


    phoneBook.forEach {
        it.showUserInfo()
        println()
    }

}