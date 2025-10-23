package lesson_15

abstract class ForumMember {

    abstract val name: String

    companion object {
        private var counter = 1
    }

    val memberId: Int = counter++

    fun readForum() {
        println("$name читает форум")
    }

    fun sendMessage(text: String) {
        println("$name: $text")
    }

}

class FUser(override val name: String) : ForumMember()

class FAdmin(override val name: String) : ForumMember() {

    fun deleteMessage(messageId: Int) {
        println("$name удалил сообщение $messageId")

    }

    fun deleteUser(memberId: Int) {
        println("$name удалил пользователя $memberId")
    }
}

fun main() {

    val user = FUser("User")
    user.sendMessage("Hello")
    user.readForum()

    println()

    val admin = FAdmin("Admin")
    admin.sendMessage("Hi")
    admin.readForum()
    admin.deleteUser(user.memberId)
    admin.deleteMessage(1)

}