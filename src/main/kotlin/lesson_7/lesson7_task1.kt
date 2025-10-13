const val PASSWORD_LENGTH = 6

fun main() {

    var password = ""
    for (char in 1..PASSWORD_LENGTH / 2) {
        val randomNumber = ('1'..'9').random()
        val randomSymbol = ('a'..'z').random()
        password += randomNumber
        password += randomSymbol
    }
    print(password)
}