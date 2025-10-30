data class ItemStack(val name: String, val amount: Int, val description: String)

fun main() {
    val itemStack = ItemStack("Lemon", 4, "Kisliy zaraza")
    val (name, amount, description) = itemStack
    println("$name $amount $description")
}