package com.example.apptres

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TicTacToeGame() {
    // Variables para cada celda del tablero
    var posT00 by remember { mutableStateOf("") }
    var posT01 by remember { mutableStateOf("") }
    var posT02 by remember { mutableStateOf("") }
    var posT10 by remember { mutableStateOf("") }
    var posT11 by remember { mutableStateOf("") }
    var posT12 by remember { mutableStateOf("") }
    var posT20 by remember { mutableStateOf("") }
    var posT21 by remember { mutableStateOf("") }
    var posT22 by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Fila 1
        Row {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(4.dp)
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
                    .clickable { if (posT00.isEmpty()) posT00 = "X" },
                contentAlignment = Alignment.Center
            ) {
                Text(text = posT00, fontSize = 24.sp, color = Color.Black)
            }
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(4.dp)
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
                    .clickable { if (posT01.isEmpty()) posT01 = "X" },
                contentAlignment = Alignment.Center
            ) {
                Text(text = posT01, fontSize = 24.sp, color = Color.Black)
            }
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(4.dp)
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
                    .clickable { if (posT02.isEmpty()) posT02 = "X" },
                contentAlignment = Alignment.Center
            ) {
                Text(text = posT02, fontSize = 24.sp, color = Color.Black)
            }
        }
        // Fila 2
        Row {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(4.dp)
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
                    .clickable { if (posT10.isEmpty()) posT10 = "X" },
                contentAlignment = Alignment.Center
            ) {
                Text(text = posT10, fontSize = 24.sp, color = Color.Black)
            }
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(4.dp)
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
                    .clickable { if (posT11.isEmpty()) posT11 = "X" },
                contentAlignment = Alignment.Center
            ) {
                Text(text = posT11, fontSize = 24.sp, color = Color.Black)
            }
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(4.dp)
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
                    .clickable { if (posT12.isEmpty()) posT12 = "X" },
                contentAlignment = Alignment.Center
            ) {
                Text(text = posT12, fontSize = 24.sp, color = Color.Black)
            }
        }
        // Fila 3
        Row {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(4.dp)
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
                    .clickable { if (posT20.isEmpty()) posT20 = "X" },
                contentAlignment = Alignment.Center
            ) {
                Text(text = posT20, fontSize = 24.sp, color = Color.Black)
            }
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(4.dp)
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
                    .clickable { if (posT21.isEmpty()) posT21 = "X" },
                contentAlignment = Alignment.Center
            ) {
                Text(text = posT21, fontSize = 24.sp, color = Color.Black)
            }
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(4.dp)
                    .background(Color.LightGray, RoundedCornerShape(8.dp))
                    .clickable { if (posT22.isEmpty()) posT22 = "X" },
                contentAlignment = Alignment.Center
            ) {
                Text(text = posT22, fontSize = 24.sp, color = Color.Black)
            }
        }
    }
}