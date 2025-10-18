package lesson_11

class Room(
    val picture: String,
    val title: String,
    var members: MutableList<Member> = mutableListOf()
) {

    fun addMember(member: Member) {
        members.add(member)
        println("К комнате ($picture) '$title' присоединился ${member.nickname}")
    }

    fun updateStatus(nickname: String, newStatus: MemberStatus) {
        val user = members.find { it.nickname == nickname }
        user?.status = newStatus
        println("Статус пользователя $nickname изменен на '${newStatus.displayName}'")
    }

}

class Member(
    var nickname: String,
    var status: MemberStatus
)

enum class MemberStatus(val displayName: String) {
    TALKING("разговаривает"),
    MICROPHONE_OFF("микрофон выключен"),
    MUTED("пользователь заглушен")
}


fun main() {
    val room = Room(
        picture = "img.jpg",
        title = "Simple Room"
    )

    val member1 = Member(
        nickname = "Vasya",
        status = MemberStatus.MICROPHONE_OFF
    )

    val member2 = Member(
        nickname = "Petya",
        status = MemberStatus.MICROPHONE_OFF
    )

    room.addMember(member1)
    room.addMember(member2)

    room.updateStatus(member1.nickname, MemberStatus.TALKING)
    room.updateStatus(member1.nickname, MemberStatus.MUTED)
}