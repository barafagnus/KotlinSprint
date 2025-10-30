package lesson_22

class MainScreenViewModel {

    private data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false
    )

    private var mainScreenState: MainScreenState = MainScreenState()

    fun loadData() {
        println("Состояние: $mainScreenState")

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Состояние: $mainScreenState")

        mainScreenState = mainScreenState.copy(data = "some data")
        println("Состояние: $mainScreenState")

    }
}

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData()
}