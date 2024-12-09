package com.example.appcambiovista

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appcambiovista.ui.theme.AppCambioVistaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppCambioVistaTheme {
                NavegacionEntreVentanas()
            }
        }
    }
}




@Composable
fun NavegacionEntreVentanas(){
    val controladorNavegacion = rememberNavController()
    NavHost(navController = controladorNavegacion, startDestination = "inicio"){
        composable("inicio") { MyApp(controladorNavegacion) }
        composable("detalles") { DetallesProducto(controladorNavegacion) }
    }
}

@Composable
fun DetallesProducto(navController: NavController){
    Column (){
        Text("Esto son los detalles cuando pinchas el boton")
    }
}


@Composable
fun MyApp(navController: NavController){
    Surface() {
        Column (){
            Button(onClick = {
                navController.navigate("detalles")
            }) { }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun vista() {
    AppCambioVistaTheme {
        NavegacionEntreVentanas()
    }
}