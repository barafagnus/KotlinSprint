fun main() {
    print("Логин: ")
    val login = readln()

    print("Пароль: ")
    val password = readln()

    if (authorize(login, password)) {
        val token = getToken()
        if (token != null) {
            val shoppingCart = getShoppingCart(token)
            shoppingCart?.forEach { println(it) }
        }
    } else println("Ошибка авторизации")

}


data class User(val login: String, val password: String)

val users = listOf<User>(
    User(login = "usr1", password = "1234"),
    User(login = "usr2", password = "4321")
)

var credentials: User? = null
const val TOKEN_LENGTH = 32
var generatedTokens = mutableListOf<String>()

fun authorize(authLogin: String, authPassword: String): Boolean {
    if (users.any { it.login == authLogin && it.password == authPassword }) {
        credentials = User(login = authLogin, password = authPassword)
        return true
    } else return false
}

fun getToken(): String? {
    val digits = '0'..'9'
    val lowerCase = 'a'..'z'
    val upperCase = 'A'..'Z'
    val allowedChars = digits + lowerCase + upperCase

    val token = buildString {
        repeat(TOKEN_LENGTH) {
            append(allowedChars.random())
        }
    }
    generatedTokens.add(token)
    return token
}


data class Item(val title: String, val category: String, val price: Double)

val items = listOf<Item>(
    Item(title = "Игровая мышь Rat v1.0", category = "Периферия для компьютеров", price = 1200.0),
    Item(title = "Монитор Eyes 24.5", category = "Мониторы", price = 20000.0),
    Item(title = "Клавиатура Keyz", category = "Периферия для компьютеров", price = 2300.0)
)

fun getShoppingCart(token: String?): List<Item>? {
    return if (token in generatedTokens) items else null
}