package com.tinyappco.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tinyappco.helloworld.ui.theme.HelloWorldTheme

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Test", "Test2"))
        }
    }
}

data class Message(val label: String, val transaction1: String, val transaction2: String)

@Composable
fun MessageCard(msg: Message) {
    Column {
        Text(text = msg.label,
            style = TextStyle(
                fontSize = 20.sp
            )
        )
        Text(text = msg.transaction1)
        Text(text = msg.transaction2)
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Recent Transactions",
            "R2000 - Groceries",
            "R600 - Dog food & treats")
    )
}