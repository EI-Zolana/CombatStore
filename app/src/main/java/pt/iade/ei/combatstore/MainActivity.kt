package pt.iade.ei.combatstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.annotation.R
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
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.White,
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
                Row (horizontalArrangement = Arrangement.SpaceEvenly,
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
                            Icons.Outlined.Star,
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Featured"
                        )
                    }

                }
            }
        }


    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
        ) {
            Row {
                Text(
                    text = "CombatStore",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Black

                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Card (modifier = Modifier.fillMaxWidth()){
                Box(
                    ){
                   Image(painter = painterResource(pt.iade.ei.combatstore.R.drawable.ic_launcher_background),
                       contentDescription = "", // adicionar uma descrição a imagem que adicionar
                       contentScale = ContentScale.Crop,
                       modifier = Modifier.height(200.dp)
                                        .fillMaxWidth()
                   )
                    Column(modifier = Modifier.align(Alignment.BottomStart)) {
                        Text(
                        text = "EA SPORTS UFC 3"
                    )
                    }
                }

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
