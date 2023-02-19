package com.example.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Row(
               modifier = Modifier
                    .fillMaxSize(0.5f)
                    .background(Color.Yellow),
               verticalAlignment = Alignment.CenterVertically,
               horizontalArrangement = Arrangement.Center
                ) {
                Text(text = "Hello there!")
                Text(text = "Hello")
                Text(text = "Hello")
            }
        }
    }
}