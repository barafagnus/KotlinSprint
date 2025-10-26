package lesson_14

class Chat {

    private val messages = mutableListOf<Message>()

    fun addMessage(author: String, text: String) {
        messages.add(Message(author, text))
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        if (messages.any { it.id == parentMessageId }) {
            messages.add(ChildMessage(author, text, parentMessageId))

        } else {
            println("Error: сообщение с id $parentMessageId не найдено")
        }
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { message ->
            if (message is ChildMessage) message.parentMessageId
            else message.id
        }

        groupedMessages.forEach { (_, value) ->
            value.forEach { message ->
                if (message is ChildMessage) {
                    println("\t↳ ${message.author}: ${message.text}")
                } else println("${message.author}: ${message.text}")
            }
        }
    }

}

open class Message(
    open val author: String,
    open val text: String
) {
    val id: Int

    companion object {
        var idCounter = 0
    }

    init {
        idCounter++
        id = idCounter
    }
}

class ChildMessage(
    override val author: String,
    override val text: String,
    val parentMessageId: Int
) : Message(author, text)

fun main() {

    val chat = Chat()
    chat.addMessage("Alex", "What's happened?")
    chat.addMessage("Irina", "Hi.")
    chat.addThreadMessage("John", "(to Alex) Nothing...", 1)
    chat.addMessage("Steve", "Good morning.")
    chat.addThreadMessage("Serhio", "(to Steve) too.", 4)

    chat.printChat()

}