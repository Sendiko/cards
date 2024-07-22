package com.sendiko.cards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sendiko.cards.ui.theme.CardsTheme
import com.sendiko.variouscard.elevated.ElevatedMenuCard
import com.sendiko.variouscard.outline.OutlinedMenuCard
import com.sendiko.variouscard.selectable.SelectableMenuCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
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
    val textBody = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt"
    CardsTheme {
        val isSelected = true
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                OutlinedMenuCard(
                    modifier = Modifier.weight(1f),
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            modifier = Modifier.size(48.dp),
                            imageVector = Icons.Rounded.Person,
                            contentDescription = "",
                        )
                    },
                    title = "Title Card",
                    textBody = textBody
                )
                Spacer(modifier = Modifier.width(8.dp))
                SelectableMenuCard(
                    onClick = { /*TODO*/ },
                    isSelected = isSelected,
                    modifier = Modifier.weight(1f),
                    icon = {
                        Icon(
                            modifier = Modifier.size(48.dp),
                            imageVector = Icons.Rounded.Person,
                            contentDescription = "",
                            tint = if (isSelected) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurface
                        )
                    },
                    title = "Title Card",
                    textBody = textBody
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                ElevatedMenuCard(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f),
                    icon = {
                        Icon(
                            modifier = Modifier.size(48.dp),
                            imageVector = Icons.Rounded.Person,
                            contentDescription = "",
                        )
                    },
                    title = "Title Card",
                    textBody = textBody
                )
                Spacer(modifier = Modifier.width(8.dp))
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}