package pt.iade.ei.combatstore

import android.os.Bundle
import android.widget.Space
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
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iade.ei.combatstore.ui.theme.CombatStoreTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CombatStoreTheme {
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView() {
    val games =listOf(
        Game(
            id = 1,
            title = "UFC 3",
            shortDescription = "Realistic fighting gameplay",
            longDescription = "",
            price = 29.99,
            imageResId = R.drawable.ea_ufc3_banner
        ),
        Game(
            id = 2,

        )
    )
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
        bottomBar = {
            BottomAppBar (
                containerColor = Color.White,
                contentColor = Color.Gray
            ){
                Row (   modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically){
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            Icons.Outlined.Star,
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Featured"
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            painter = painterResource(pt.iade.ei.combatstore.R.drawable.outline_archive_24),
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "History"
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            Icons.Outlined.Person,
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Profile"
                        )
                    }

                }
            }
        }


    ) { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
        item { Spacer(modifier = Modifier.height(30.dp)) }

            item {
                Text(
                    text = "CombatStore",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            items(gamesList) { game ->
                GameBanner(
                    gameImage = game.image,
                    gameName = game.name
                )

                Spacer(modifier = Modifier.height(8.dp))
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    CombatStoreTheme {
        MainView()
    }
}




@Composable
fun GameBanner(
    @DrawableRes gameImage : Int,
    gameName : String
) {
    Card (
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp)
       //  shape = CardDefaults.RoundedCornerShape(4.dp)

    ){
        Box(
        ){
            Image(painter = painterResource(gameImage),
                contentDescription = gameName, // adicionar uma descrição a imagem que adicionar

                contentScale = ContentScale.Crop,
                modifier = Modifier.height(200.dp)
                    .fillMaxWidth()
            )
            Column(modifier = Modifier.align(Alignment.BottomStart)) {
                Text(
                    text = gameName
                )
            }
            Spacer(modifier = Modifier)
        }
    }
}


