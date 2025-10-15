const val MIN_PASSWORD_LENGTH = 6

fun main() {
    val DIGITS = '0'..'9'
    val LOWERCASE = 'a'..'z'
    val UPPERCASE = 'A'..'Z'

    print("Введите длину пароля (минимум $MIN_PASSWORD_LENGTH) символов: ")
    val passwordLength = readln().toInt()
    val password = mutableListOf<Char>()

    if (passwordLength >= MIN_PASSWORD_LENGTH) {
        password.add(DIGITS.random())
        password.add(LOWERCASE.random())
        password.add(UPPERCASE.random())

        for (i in 3 until passwordLength) {
            password.add((DIGITS + LOWERCASE + UPPERCASE).random())
        }
        val resultPassword = password.shuffled().joinToString(separator = "")
        println(resultPassword)

    } else println("Минимальная длина пароля должна составлять $MIN_PASSWORD_LENGTH символов")
}