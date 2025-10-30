class Folder(
    name: String,
    val amountOfFiles: Int,
    private var isSecret: Boolean
) {

    var name: String = name
        get() = if (isSecret) "Скрытая папка, количество файлов - 0"
        else "$field, количество файлов - $amountOfFiles"

    fun setIsSecret(isSecret: Boolean) {
        this.isSecret = isSecret
    }

    fun getAmountOfFiles() = amountOfFiles

}

fun main() {
    val folder = Folder("Папка для взрослых", 5, true)
    println(folder.name)

    folder.setIsSecret(false)
    println(folder.name)
}