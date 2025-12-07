package pt.iade.ei.combatstore

data class Game(
    val id: Long,
    val title: String,
    val shortDescription: String,
    val longDescription: String,
    val price: Double,
    val imageResId: Int
)