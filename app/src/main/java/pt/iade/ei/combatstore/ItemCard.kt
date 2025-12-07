package pt.iade.ei.combatstore

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ItemCard(item: PurchasableItem, onClick: () -> Unit ) {
    Row(
        modifier = Modifier
            .padding(vertical = 16.dp)
            .fillMaxWidth()
            .clickable { onClick() }
    ) {
        Card(
            modifier = Modifier
                .height(80.dp)
                .width(80.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray)
        ) {
            Box(contentAlignment = Alignment.Center)
            {
                Image(
                    painter = painterResource(R.drawable.iron_man),
                    contentDescription = "item.name"
                )
            }
        }

        Spacer(modifier = Modifier.width(12.dp))
        Column (
            modifier = Modifier.weight(1f)
        ) {
            Text(text = item.name, fontWeight = FontWeight.Bold)
            Text(text = "Some description")
        }

        Text(
            text = "€${item.price}",
        fontWeight = FontWeight.Bold
        )

    }
}


@Preview(showBackground = true)
@Composable
fun ItemCardPreview() {

    val exampleItem = PurchasableItem(

        id = 12,
        name = "Iron Man",
        description = "Armadura de ferro",
        price = 19.99,
        imageResId = R.drawable.iron_man
    )
     ItemCard(item = exampleItem, onClick = {})
}
