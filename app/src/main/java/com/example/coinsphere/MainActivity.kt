package com.example.coinsphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.models.coinsList
import com.example.coinsphere.ui.theme.Background
import com.example.coinsphere.ui.theme.CoinSphereTheme
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoinSphereTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun coinSphere() {
    Column(
        modifier = Modifier
            .background(Background)
            .padding(top = 30.dp)
            .padding(bottom = 30.dp)
            .fillMaxSize()
    ) {
        //CoinSphere
        Column(
            modifier = Modifier
                .padding(start = 30.dp)
                .padding(end = 30.dp)
        ) {
            Text(
                text = "CoinSphere",
                color = TextMain,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 20.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Surface)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Global Market Cap",
                        color = TextDim,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(bottom = 5.dp)
                    )
                    Text(
                        text = "$2.18T",
                        color = TextMain,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Surface)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Fear & Greed",
                        color = TextDim,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(bottom = 5.dp)
                    )
                    Text(
                        text = "Neutral (54)",
                        color = TextMain,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Surface)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Altcoin Season",
                        color = TextDim,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(bottom = 5.dp)
                    )
                    Text(
                        text = "No",
                        color = TextMain,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }

        //Valores
        Column{
            Row(
                modifier = Modifier
                    .padding(top = 0.dp)
                    .padding(bottom = 10.dp)
                    .padding(start = 40.dp)
                    .padding(end = 40.dp)
            ) {
                Text(
                    text = "#",
                    color= TextDim,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .weight(1f)
                )
                Text(
                    text = "Name",
                    color= TextDim,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .weight(1f)
                )
                Text(
                    text = "Price",
                    color= TextDim,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .weight(1f)
                )
            }
            Box(
                modifier = Modifier
                    .height(1.8.dp)
                    .fillMaxWidth()
                    .background(Surface)
            )
            LazyColumn(
                modifier = Modifier
                    .padding(top = 15.dp)
                    .padding(start = 30.dp)
                    .padding(end = 30.dp)
            ) {
                items(coinsList) { coin ->
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(Surface)
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                        ) {
                            Text(
                                text = coin.number.toString(),
                                color = TextDim,
                                fontSize = 13.sp,
                                modifier = Modifier
                                    .weight(1f)
                            )

                            Text(
                                text = coin.name,
                                color = TextMain,
                                modifier = Modifier
                                    .weight(1f)
                            )
                            Text(
                                text = "$" + coin.price.toString(),
                                color = TextMain,
                                modifier = Modifier
                                    .weight(1f)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun GreetingPreview() {
    CoinSphereTheme {
        coinSphere()
    }
}