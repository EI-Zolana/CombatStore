package pt.iade.ei.combatstore


data class PurchasableItem(

    val id: Long,
    val name: String,
    val description: String,
    val price: Double,
    val imageResId: Int

)
