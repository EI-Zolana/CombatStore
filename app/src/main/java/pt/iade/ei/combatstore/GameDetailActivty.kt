package pt.iade.ei.combatstore
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iade.ei.combatstore.ui.theme.CombatStoreTheme


class GameDetailActivty : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CombatStoreTheme {
                GameDetailView()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameDetailView() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.Gray,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Row ( modifier = Modifier.padding(all = 4.dp)
                        .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End) {

                        Icon(
                            Icons.Outlined.Notifications,
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            Icons.Outlined.Settings,
                            contentDescription = ""
                            // adicionar uma descrição
                        )
                    }
                }
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {


            Row (modifier = Modifier.fillMaxWidth()){
                Card( modifier = Modifier
                    .width(130.dp)
                    .height(130.dp),
                    shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black)
                ){
                    Box( contentAlignment = Alignment.Center ) {
                        Text("Game")
                    }


                }
                Spacer(
                    modifier = Modifier.width(12.dp)
                )
                Column (modifier = Modifier.weight(1f)
                ){
                    Text(text = "A cerca dos melhores jogos de futebol")
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(text = "Purchasable Items",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(12.dp))
                }
            }
            ItemCard()
            ItemCard()
            ItemCard()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GameDetailPreview() {
    CombatStoreTheme {
    GameDetailView()
    }
}


@Composable
fun ItemCard(){
        Row(modifier = Modifier.padding(vertical =  8.dp)
                            .fillMaxWidth()) {
            Card (modifier = Modifier.height(80.dp)
                                    .width(80.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.LightGray)){
            Box(
contentAlignment = Alignment.Center
            ){
                Text("Item Image")
            }
            }

        }
    Spacer(modifier = Modifier.width(12.dp))
    Column (){
        Text("Item Name",
            fontWeight = FontWeight.Bold)
        Text(
            text = "Item description in brief detail . At least enough to cover 2 "
        )
    }
     Text(
        text = "12.99",
        fontWeight = FontWeight.Bold,
    )
}

