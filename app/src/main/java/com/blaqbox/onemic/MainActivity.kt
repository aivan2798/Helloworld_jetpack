package com.blaqbox.onemic
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.ComponentActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.compose.material.Text
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable



class MainActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContent {
            Text(text = "Hello World")
        }
   }
}

@Composable
fun HelloWorld() {
   Text("Hello World!")
}