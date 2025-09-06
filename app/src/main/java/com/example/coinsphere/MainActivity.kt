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
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coinsphere.ui.theme.CoinSphereTheme

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
    val Background = Color(0xFF0B1020)
    val Surface    = Color(0xFF151B2E)
    val TextMain   = Color(0xFFE8ECF8)
    val TextDim    = Color(0xFF9AA3B2)

    Column(
        modifier = Modifier
            .background(Background)
            .padding(30.dp)
            .fillMaxSize()
    ) {
        //CoinSphere
        Column {
            Text(
                text = "CoinSphere",
                color = TextMain
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .background(Surface)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Global Market Cap",
                        color = TextDim
                    )
                    Text(
                        text = "$2.18T",
                        color = TextMain
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .background(Surface)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Fear & Greed",
                        color = TextDim
                    )
                    Text(
                        text = "Neutral (54)",
                        color = TextMain
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Surface)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Altcoin Season",
                        color = TextDim
                    )
                    Text(
                        text = "No",
                        color = TextMain
                    )
                }
            }
        }

        //Valores
        Column {

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