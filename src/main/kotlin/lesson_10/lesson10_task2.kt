fun main() {
    print("Логин: ")
    val login = readln()

    print("Пароль: ")
    val password = readln()

    println(
        if (validateInput(userLogin = login, userPassword = password)) "Добро пожаловать"
        else "Логин или пароль недостаточно длинные"
    )
}

private const val MIN_INPUT_LENGTH = 6

fun validateInput(userLogin: String, userPassword: String): Boolean =
    userLogin.length >= MIN_INPUT_LENGTH && userPassword.length >= MIN_INPUT_LENGTH
