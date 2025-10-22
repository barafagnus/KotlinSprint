package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String? = null,
) {
    fun getInfo() {
        println("$id $login $password $mail $bio")
    }

    fun setBio() {
        print("Опишите биографию: ")
        bio = readln()
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        val currentPassword = readln()

        if (currentPassword == password) {
            print("Новый пароль: ")
            password = readln()
            println("Пароль изменен")
        } else println("Неправильный пароль")
    }
}

fun main() {
    val user = User2(
        id = 1,
        login = "User1",
        password = "1234",
        mail = "user1@gmail.com"
    )

    user.setBio()
    user.changePassword()
    user.getInfo()
}
