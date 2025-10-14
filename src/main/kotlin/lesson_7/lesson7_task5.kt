const val MIN_PASSWORD_LENGTH = 6
val CHARS = ('0'..'9') + ('a'..'z') + ('A'..'Z')

fun main() {
    print("Введите длину пароля (минимум $MIN_PASSWORD_LENGTH) символов: ")
    val passwordLength = readln().toInt()

    if (passwordLength >= MIN_PASSWORD_LENGTH) {
        for (i in 0 until passwordLength) {
            val password = CHARS.random()
            print(password)
        }
    } else println("Минимальная длина пароля должна составлять $MIN_PASSWORD_LENGTH символов")
}