package pt.iade.ei.combatstore

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable

fun GameBanner (game: Game, onClick: () -> Unit) {

    Card (
       modifier = Modifier
           .fillMaxWidth()
           .clickable{ onClick ()},
        shape = RoundedCornerShape(18.dp)
    ) {
        Box{
            Image(
                painter = painterResource(id = game.imageResId),
                contentDescription = "Banner ",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            )

            Column (modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(12.dp))
            {
                Text(text = game.title, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Text(text = game.shortDescription, fontSize = 15.sp, fontWeight = FontWeight.Normal, color = Color.Black)
            }
        }
    }

    }

@Preview(showBackground = true)
@Composable
fun  GameBannerPreview() {
    GameBanner(
        game = Game(
         12,
            "Avengers Initial",
            "Os herois",
            "Os Herois mais poderosos da terra",
            12.99,
            imageResId = R.drawable.martelo
        )
    ) {}
}