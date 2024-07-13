package com.thiennh23.composecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.thiennh23.composecard.ui.theme.ComposeCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeCardTheme {
               Box(
                   modifier = Modifier
                       .fillMaxSize()
                       .background(color = Color.Black.copy(0.8f)),
                   contentAlignment = Alignment.Center)
               {
                   MyCustomCard(
                       modifier = Modifier.fillMaxWidth(0.8f),
                       image = R.drawable.card,
                       title = stringResource(R.string.title),
                       text = stringResource(R.string.description),
                       publisher = Publisher(R.drawable.elephant,"Nguyen Huu Thien", "Android developer")
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeCardTheme {
        Greeting("Android")
    }
}