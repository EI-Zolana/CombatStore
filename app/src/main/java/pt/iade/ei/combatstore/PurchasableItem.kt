package pt.iade.ei.combatstore


data class PurchasableItem(

    var id: Long,
    var name: String,
    var description: String,
    var price: Double,
    var imageResId: Int

)
