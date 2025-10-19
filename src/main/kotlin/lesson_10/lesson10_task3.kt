fun main() {
    print("Задайте длину пароля: ")
    val passwordLength = readln().toInt()
    val password = passwordGenerator(passwordLength)
    println(password)
}


fun passwordGenerator(length: Int): String {
    val digits = ('0'..'9')
    val symbols = ('!'..'/') + ' '

    return buildString {
        repeat(length) {
            if (it % 2 == 0) append(digits.random())
            else append(symbols.random())
        }
    }
}

