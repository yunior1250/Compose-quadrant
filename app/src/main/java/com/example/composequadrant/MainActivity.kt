package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    ComposeQuadrantApp()


                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(
        Modifier.fillMaxWidth()

    ) {
        Row(Modifier.weight(1f)) {
            InfoCard(
                title = stringResource(R.string.title1),
                description = stringResource(R.string.description1),
                backgroundColor = Color.Red,
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                title = stringResource(R.string.title2),
                description = stringResource(R.string.description2),
                backgroundColor = Color.Blue,
                modifier = Modifier.weight( 1f)
            )

        }
        Row(Modifier.weight(1f)) {
            InfoCard(
                title = stringResource(R.string.title3),
                description = stringResource(R.string.description3),
                backgroundColor = Color.White,
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                title = stringResource(R.string.title4),
                description = stringResource(R.string.description4),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
                
            )

        }


    }
}

@Composable
fun InfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier,


) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFF9800),





        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            color = Color(0xFF09700E)

        )
    }
}

fun Text(text: String, textAlign: TextAlign, backgroundColor: Color) {

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
    ComposeQuadrantTheme {
        //Greeting("Android")
        ComposeQuadrantApp()

    }
}