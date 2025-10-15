fun main() {
    print("Задайте длину пароля: ")
    val passwordLength = readln().toInt()
    val password = passwordGenerator(passwordLength)
    println(password)
}


val DIGITS = ('0'..'9')
val SYMBOLS = ('!'..'/') + ' '

fun passwordGenerator(length: Int): String {
    return buildString {
        repeat(length) {
            if (it % 2 == 0) append(DIGITS.random())
            else append(SYMBOLS.random())
        }
    }
}

