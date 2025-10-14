const val PASSWORD_LENGTH = 6

fun main() {
    val numbersRange = '1'..'9'
    val symbolsRange = 'a'..'z'
    var password = ""

    for (i in 1..PASSWORD_LENGTH / 2) {
        val randomNumber = numbersRange.random()
        val randomSymbol = symbolsRange.random()
        password += randomNumber
        password += randomSymbol
    }

    print(password)
}