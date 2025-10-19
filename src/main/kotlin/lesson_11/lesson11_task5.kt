package lesson_11

class Forum private constructor(
    val members: MutableList<ForumMember> = mutableListOf(),
    val messages: MutableList<ForumMessage> = mutableListOf(),
) {

    fun printThread() {
        messages.forEach { message ->
            val author = members.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")
        }
    }

    class Builder {
        private var nextUserId: Int = 1
        private var members: MutableList<ForumMember> = mutableListOf()
        private var messages: MutableList<ForumMessage> = mutableListOf()

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

        fun build(): Forum = Forum(members, messages)

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

    val forumBuilder = Forum.Builder()

    val user1 = forumBuilder.createNewUser("Alex")
    val user2 = forumBuilder.createNewUser("Kate")

    forumBuilder.createNewMessage(user1.userId, "(1) Привет.")
    forumBuilder.createNewMessage(user2.userId, "(2) Алоха Леха!")
    forumBuilder.createNewMessage(
        user1.userId,
        "(3) Еще бы задачек на подобные часто встречающиеся паттерны."
    )
    forumBuilder.createNewMessage(user2.userId, "(4) Может быть после проверки нам подкинут?")

    val forum = forumBuilder.build()
    forum.printThread()

}