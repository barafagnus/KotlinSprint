const val MIN_PASSWORD_LENGTH = 6

fun main() {
    val digits = '0'..'9'
    val lowerCase = 'a'..'z'
    val upperCase = 'A'..'Z'
    val symbolsRange = digits + lowerCase + upperCase

    print("Введите длину пароля (минимум $MIN_PASSWORD_LENGTH) символов: ")
    val passwordLength = readln().toInt()
    val password = mutableListOf<Char>()

    if (passwordLength >= MIN_PASSWORD_LENGTH) {
        password.add(digits.random())
        password.add(lowerCase.random())
        password.add(upperCase.random())

        for (i in 3 until passwordLength) {
            password.add((symbolsRange).random())
        }
        val resultPassword = password.shuffled().joinToString(separator = "")
        println(resultPassword)

    } else println("Минимальная длина пароля должна составлять $MIN_PASSWORD_LENGTH символов")
}