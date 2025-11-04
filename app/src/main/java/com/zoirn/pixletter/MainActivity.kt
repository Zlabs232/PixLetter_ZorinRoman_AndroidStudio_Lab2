package com.zoirn.pixletter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.zoirn.pixletter.ui.theme.PixLetterTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PixLetterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun RoyalInvitationPreview() {
        PixLetterTheme {
            GreetingText (message = "Royal Decree!\n Dear Denis\nHis Majesty theKing\nInvites you to a great feast!\nCome to the castle before sunset, \notherwise, you risk losing your head!", from = "From King Arthur")
        }
    }

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Text(
        text = message,
        fontSize = 100.sp,
        lineHeight = 80.sp
    )
    Text(
        text = from,
        fontSize = 36.sp
    )
}