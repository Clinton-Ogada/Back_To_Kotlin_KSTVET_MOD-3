package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContent {
           HappyBirthdayTheme {
               // A surface container using the 'background' color from the theme
               Surface(
                   modifier = Modifier.fillMaxSize(),
                   color = MaterialTheme.colorScheme.background
               ) {
                   // Call the GreetingText composable to display the birthday message
                   GreetingText(message = "Happy Birthday Sam!", from = "From Emma")
               }
           }
       }
   }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
   // Create a column to display text vertically with specific alignments and styles
   Column(
       verticalArrangement = Arrangement.Center,
       modifier = modifier
   ) {
       // Display the main birthday message
       Text(
           text = message,
           fontSize = 100.sp,
           lineHeight = 116.sp,
           textAlign = TextAlign.Center // Center-align the text
       )
       // Display the sender's name
       Text(
           text = from,
           fontSize = 36.sp,
           modifier = Modifier
               .padding(16.dp) // Add padding around the sender's name
               .align(alignment = Alignment.End) // Align the sender's name to the right
       )
   }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        // Preview the birthday card with specific message and sender's name
        GreetingText(message = "Happy Birthday Sam!", from ="From Emma")
    }
}
