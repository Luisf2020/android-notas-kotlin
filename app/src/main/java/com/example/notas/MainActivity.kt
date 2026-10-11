package com.example.notas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                NotasScreen()
            }
        }
    }
}

@androidx.compose.runtime.Composable
fun NotasScreen() {
    val notas = remember { mutableStateListOf("Repasar Compose") }
    var texto by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Row {
            OutlinedTextField(
                value = texto,
                onValueChange = { texto = it },
                label = { Text("Nueva nota") },
                modifier = Modifier.weight(1f),
            )
            Button(
                onClick = {
                    val limpio = texto.trim()
                    if (limpio.isNotEmpty()) {
                        notas.add(limpio)
                        texto = ""
                    }
                },
                modifier = Modifier.padding(start = 8.dp),
            ) { Text("Agregar") }
        }

        Text("${notas.size} notas", modifier = Modifier.padding(vertical = 12.dp))

        LazyColumn {
            items(notas) { nota -> Text("- $nota", modifier = Modifier.padding(4.dp)) }
        }
    }
}
