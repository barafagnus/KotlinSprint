package lesson_13

class Contact(
    val name: String,
    val phone: Long,
    val company: String?
) {
    override fun toString(): String {
        return "Contact(name=$name, phone=$phone, company=$company)"
    }
}

fun main() {

    val contact = Contact(
        name = "Alex",
        phone = 71234567890,
        null
    )

    println(contact)

}