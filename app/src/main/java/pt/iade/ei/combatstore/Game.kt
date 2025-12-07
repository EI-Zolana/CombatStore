package pt.iade.ei.combatstore

data class Game(
    var id: Long,
    var title: String,
    var shortDescription: String,
    var longDescription: String,
    var price: Double,
    var imageResId: Int
)

