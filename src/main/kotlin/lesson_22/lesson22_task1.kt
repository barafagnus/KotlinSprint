class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {

    val regularBook1 = RegularBook("Дюна", "Френк Герберт")
    val regularBook2 = RegularBook("Дюна", "Френк Герберт")

    val dataBook1 = DataBook("Трое в лодке, не считая собаки", "Джером Клапка Джером")
    val dataBook2 = DataBook("Трое в лодке, не считая собаки", "Джером Клапка Джером")

    // false, т.к. сравниваются ссылки объектов (являются ли объекты одним и тем же экземпляром)
    println(regularBook1 == regularBook2)

    // true, т.к. сравниваются значения полей объектов
    println(dataBook1 == dataBook2)

}