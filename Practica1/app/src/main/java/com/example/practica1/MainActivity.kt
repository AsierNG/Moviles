package com.example.practica1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val eTCuadrado = findViewById<EditText>(R.id.eTCuadrado)
        val eTBTriangulo = findViewById<EditText>(R.id.eTBTriangulo)
        val eTATriangulo = findViewById<EditText>(R.id.eTATriangulo)
        val eTRCirculo = findViewById<EditText>(R.id.eTRCirculo)

        val btnCuadrado = findViewById<Button>(R.id.btnCuadrado)
        val btnTriangulo = findViewById<Button>(R.id.btnTriangulo)
        val btnCirculo = findViewById<Button>(R.id.btnCirculo)
        btnCuadrado.setOnClickListener{
            val mensaje : Double = eTCuadrado.text.toString().toDouble()
            val intent = Intent(this,Cuadrado::class.java)
            intent.putExtra("envio",mensaje)
            startActivity(intent)
        }
        btnTriangulo.setOnClickListener{
            val mensaje :String= eTBTriangulo.text.toString()
            val mensaje2 :String= eTATriangulo.text.toString()
            val intent = Intent(this,Triangulo::class.java)
            intent.putExtra("envio",mensaje)
            intent.putExtra("envio",mensaje2)
            startActivity(intent)
        }
        btnCirculo.setOnClickListener{
            val mensaje :String= eTRCirculo.text.toString()
            val intent = Intent(this,Circulo::class.java)
            intent.putExtra("envio",mensaje)
            startActivity(intent)
        }

    }
}