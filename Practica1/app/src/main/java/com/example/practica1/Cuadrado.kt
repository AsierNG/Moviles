package com.example.practica1

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cuadrado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cuadrado)

        val bundle: Bundle? = intent.extras
        val lado : Double = bundle!!.getDouble("envio")
        val resultado = findViewById<TextView>(R.id.resultado)
        val calculo = lado*lado
        resultado.text = calculo.toString()

    }
}