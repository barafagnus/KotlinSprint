class SomeUser {
    val login: String = "user"
    private val password: String = "123"

    fun validatePassword(inputPassword: String): Boolean = inputPassword == password
}

fun main() {
    val user = SomeUser()
    println(user.validatePassword("123"))
}
