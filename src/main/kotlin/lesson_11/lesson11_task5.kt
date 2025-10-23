package lesson_11

class Forum (
    private val members: MutableList<ForumMember> = mutableListOf(),
    private val messages: MutableList<ForumMessage> = mutableListOf(),
    private var nextUserId: Int = 1

) {

    fun printThread() {
        messages.forEach { message ->
            val author = members.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")
        }
    }

    fun createNewUser(name: String): ForumMember {
        val member = ForumMember(nextUserId, name)
        nextUserId++
        members.add(member)
        return member
    }

    fun createNewMessage(userId: Int, message: String) {
        if (members.any { it.userId == userId }) {
            val forumMessage = ForumMessage(authorId = userId, message = message)
            messages.add(forumMessage)
        } else println("Пользователь $userId не найден")
    }

}

data class ForumMember(
    val userId: Int,
    val userName: String,
)

data class ForumMessage(
    val authorId: Int,
    val message: String,
)


fun main() {

    val forum = Forum()

    val user1 = forum.createNewUser("Alex")
    val user2 = forum.createNewUser("Kate")

    forum.createNewMessage(user1.userId, "(1) Привет.")
    forum.createNewMessage(user2.userId, "(2) Алоха Леха!")
    forum.createNewMessage(
        user1.userId,
        "(3) Еще бы задачек на подобные часто встречающиеся паттерны."
    )
    forum.createNewMessage(user2.userId, "(4) Может быть после проверки нам подкинут?")

    forum.printThread()

}