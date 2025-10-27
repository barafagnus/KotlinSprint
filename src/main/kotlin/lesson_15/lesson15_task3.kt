package lesson_15

abstract class ForumMember(val name: String) {

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

class RegularUser(name: String) : ForumMember(name)

class Administrator(name: String) : ForumMember(name) {

    fun deleteMessage(messageId: Int) {
        println("$name удалил сообщение $messageId")

    }

    fun deleteUser(memberId: Int) {
        println("$name удалил пользователя $memberId")
    }
}

fun main() {

    val user = RegularUser("User")
    user.sendMessage("Hello")
    user.readForum()

    println()

    val admin = Administrator("Admin")
    admin.sendMessage("Hi")
    admin.readForum()
    admin.deleteUser(user.memberId)
    admin.deleteMessage(1)

}