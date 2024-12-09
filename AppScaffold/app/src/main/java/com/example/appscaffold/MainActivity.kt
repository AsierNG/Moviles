package com.example.appscaffold

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appscaffold.ui.theme.AppScaffoldTheme
import org.jetbrains.annotations.ApiStatus.Experimental

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppScaffoldTheme {
                    MiApp()
                }
            }
        }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun MiApp() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Barra superior") }) },
        bottomBar = { BottomAppBar() { Text("Barra inferior" ) } },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(Icons.Filled.AddCircle, contentDescription = "check")
            }
        },
        content = { padding ->
            Box(modifier = Modifier.padding(padding)) {
                Text("Principal")
            }

        }
    )


    /*Surface(
        modifier=Modifier.fillMaxSize().padding(30.dp),
        shape = MaterialTheme.shapes.small,
        color=MaterialTheme.colorScheme.primary,
        shadowElevation = 10.dp,
        border = BorderStroke(3.dp, Color.Black)
    ){*/

        /*Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text("Hola a todos")
            Text("¿Como están ustedes, papis?")
        }
        Row(
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            Text("Hola a todos")
            Text("¿Como están ustedes, papis?")
        }
        Row(
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            Text("Hola a todos")
            Column(
                modifier = Modifier.padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Text("Hola a todos")
                Text("¿Como están ustedes, papis?")
            }
        }
        Box(){
            Text("   de la tele")
            Icon(Icons.Filled.Check,contentDescription="Check")
        }
    }*/
}

@Preview(showBackground = true)
@Composable
fun vistaPreeliminar() {
    AppScaffoldTheme {
        MiApp()
    }
}