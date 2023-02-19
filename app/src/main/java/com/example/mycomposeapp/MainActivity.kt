package com.example.mycomposeapp

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Column(
               modifier = Modifier
                   .background(Color.Cyan)
                   .fillMaxHeight(.5f)
                   .fillMaxWidth(0.5f)
                   .border(5.dp, Color.Magenta)
                   .padding(5.dp)
                   .border(5.dp, Color.Black)
                   .padding(5.dp)
                   .border(5.dp, Color.Red) // these are applied sequentially.

           ) {
               Text(text = "Hello")
               Spacer(modifier = Modifier.height(50.dp))
               Text(text = "World")
           }
        }
    }
}