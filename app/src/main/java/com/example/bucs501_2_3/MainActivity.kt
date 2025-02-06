package com.example.bucs501_2_3

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bucs501_2_3.ui.theme.BUCS501_2_3Theme
import java.util.Vector

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BUCS501_2_3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PlayAlbum(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun PlayAlbum(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.background(Color(0,0,0)).fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(x = 0.dp, y = 100.dp)
                .background(Color(255,255,0))
        ){
            Text(text = "Momma", textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth())
            Text(text = "Kendrick Lamar", textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth())

        }
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "TPAB",
            modifier = Modifier.align(Alignment.Center).size(300.dp)
        )
        Button(
            onClick = {},
            modifier = modifier.align(Alignment.Center).offset(y = 250.dp).size(100.dp),
        ) {
            Image(
                painter = painterResource(R.drawable.img_2),
                contentDescription = "Play",
                modifier = Modifier.fillMaxSize(),
            )
        }
        Button(
            onClick = {},
            modifier = modifier.align(Alignment.Center).offset(x = 110.dp,y = 250.dp).size(100.dp),
        ) {
            Image(
                painter = painterResource(R.drawable.img_3),
                contentDescription = "Pause",
                modifier = Modifier.fillMaxSize(),
            )
        }
        Button(
            onClick = {},
            modifier = modifier.size(100.dp).align(Alignment.Center).offset(x = (-110).dp,y = 250.dp),
            ) {
//            Icon(
//                imageVector = ImageVector.vectorResource(id = R.drawable.img_1),
//                contentDescription = "Skip",
//                modifier = Modifier.fillMaxSize(),
//            )
            Image(
                painter = painterResource(R.drawable.img_1),
                contentDescription = "Skip",
                modifier = Modifier.fillMaxSize(),
            )

        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BUCS501_2_3Theme {
        PlayAlbum("Android")
    }
}