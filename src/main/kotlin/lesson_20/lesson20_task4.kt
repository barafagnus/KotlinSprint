fun main() {

    val buttons = listOf<String>("button_1", "button_2", "button_3", "button_4")

    val buttonActions = buttons.map {
        { "Нажат элемент $it" }
    }

    buttonActions.forEachIndexed { index, pressAction ->
        if ((index + 1) % 2 == 0) {
            println(pressAction())
        }
    }

}