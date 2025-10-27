class SomeUser1(
    login: String,
    password: String
) {
    var login = login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }

    var password = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = SomeUser1("admin", "1234")
    user.login = "user"
    user.password = "abc"
    print(user.password)
}