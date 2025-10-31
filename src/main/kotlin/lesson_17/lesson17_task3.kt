class Folder(
    name: String,
    amountOfFiles: Int,
    private var isSecret: Boolean
) {

    var name: String = name
        get() = if (isSecret) "Скрытая папка, количество файлов - 0"
        else "$field, количество файлов - $amountOfFiles"

    val amountOfFiles: Int = amountOfFiles
        get() = field

    fun setIsSecret(isSecret: Boolean) {
        this.isSecret = isSecret
    }

}

fun main() {
    val folder = Folder("Папка для взрослых", 5, true)
    println(folder.name)

    folder.setIsSecret(false)
    println(folder.name)
}