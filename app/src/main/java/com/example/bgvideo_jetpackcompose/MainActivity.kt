package com.example.bgvideo_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bgvideo_jetpackcompose.ui.theme.BGVideo_JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeadImage(textHeader = "БЕЗОПАСНЫЙ ГОРОД")
        }
    }
}
@Composable
private fun HeadImage(textHeader: String){
    Row(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxHeight()
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            elevation = 5.dp
        ) {
            Box() {
                Image(
                    painter = painterResource(id = R.drawable.header_bg),
                    contentDescription = "header image",
                    contentScale = ContentScale.Inside
                )
                Column(

                ) {
                    Text(text = textHeader)
                }
            }
        }
    }
}