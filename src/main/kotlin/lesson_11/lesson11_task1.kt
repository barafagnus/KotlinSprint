package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)


fun main() {
    val user1 = User(
        id = 1,
        login = "User1",
        password = "1234",
        mail = "user1@gmail.com"
    )

    val user2 = User(
        id = 2,
        login = "User2",
        password = "abcd",
        mail = "user2@gmail.com"
    )

    println("${user1.id} ${user1.login} ${user1.password} ${user1.mail}")
    println("${user2.id} ${user2.login} ${user2.password} ${user2.mail}")
}