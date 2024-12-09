package com.example.apptres

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class AppTresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTresGame()
        }
    }
}

@Composable
fun AppTresGame() {
    var board by remember { mutableStateOf(List(3) { MutableList(3) { "" } }) }
    var currentPlayer by remember { mutableStateOf("X") }
    var winner by remember { mutableStateOf<String?>(null) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Turno: $currentPlayer",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(16.dp)
        )

        // Tablero
        Column(
            modifier = Modifier
                .background(Color.LightGray)
                .padding(8.dp)
        ) {
            for (i in 0..2) {
                Row {
                    for (j in 0..2) {
                        AppTresCell(
                            value = board[i][j],
                            onClick = {
                                if (board[i][j].isEmpty() && winner == null) {
                                    board[i][j] = currentPlayer
                                    currentPlayer = if (currentPlayer == "X") "O" else "X"
                                    winner = checkWinnerAppTres(board)
                                }
                            }
                        )
                    }
                }
            }
        }

        if (winner != null) {
            Text(
                text = "Ganador: $winner",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(16.dp),
                color = Color.Green
            )
        }

        Button(
            onClick = {
                board = List(3) { MutableList(3) { "" } }
                currentPlayer = "X"
                winner = null
            },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Reiniciar")
        }
    }
}

@Composable
fun AppTresCell(value: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(100.dp)
            .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
            .background(Color.White)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = value,
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .clickable(enabled = value.isEmpty()) { onClick() }
        )
    }
}

fun checkWinnerAppTres(board: List<List<String>>): String? {
    // Revisa filas, columnas y diagonales
    for (i in 0..2) {
        if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0].isNotEmpty())
            return board[i][0]
        if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i].isNotEmpty())
            return board[0][i]
    }
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0].isNotEmpty())
        return board[0][0]
    if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2].isNotEmpty())
        return board[0][2]
    return null
}

@Preview(showBackground = true)
@Composable
fun PreviewAppTresGame() {
    AppTresGame()
}