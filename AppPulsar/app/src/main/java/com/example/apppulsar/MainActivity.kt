package com.example.apppulsar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import com.example.apppulsar.ui.theme.AppPulsarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppPulsarTheme {
                MiApp()
            }
        }
    }
}

@Composable
fun MiApp() {
    var acumularDinero2 by remember { mutableIntStateOf(0) }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xFF546E7A)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "$acumularDinero2€",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            )
            Spacer(modifier = Modifier.height(130.dp))
            CrearCirculo(acumularDinero2) { nuevoValor ->
                acumularDinero2 = nuevoValor
            }
            if (acumularDinero2 > 25) {
                Text("Mucho dinero ¿no?")
            }
        }
    }
}

@Composable
fun CrearCirculo(acumularDinero2: Int, actualizarContador2: (Int) -> Unit) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .size(90.dp)
            .clip(CircleShape)
            .clickable { actualizarContador2(acumularDinero2 + 1) },
        shape = CircleShape
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Pulsar $acumularDinero2", modifier = Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreeliminar() {
    AppPulsarTheme {
        MiApp()
    }
}
