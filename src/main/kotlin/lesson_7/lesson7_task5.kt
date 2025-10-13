const val MIN_PASSWORD_LENGTH = 6

fun main() {
    print("Введите длину пароля (минимум $MIN_PASSWORD_LENGTH) символов: ")
    val passwordLength = readln().toInt()
    if (passwordLength >= MIN_PASSWORD_LENGTH) {
        for (char in (0 until passwordLength)) {
            val password = ('0'..'z').random()
            print(password)
        }
    } else println("Минимальная длина пароля должна составлять $MIN_PASSWORD_LENGTH символов")
}