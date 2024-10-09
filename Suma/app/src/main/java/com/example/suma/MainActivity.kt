package com.example.suma

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtN1 = findViewById<EditText>(R.id.edtN1)
        val edtN2 = findViewById<EditText>(R.id.edtN2)
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val btnRestar = findViewById<Button>(R.id.btnRestar)
        val btnDividir = findViewById<Button>(R.id.btnDividir)
        val btnMult = findViewById<Button>(R.id.btnMult)
        val textResultado = findViewById<TextView>(R.id.textResultado)

        btnSumar.setOnClickListener {
            val n1 = edtN1.text.toString().toInt()
            val n2 = edtN2.text.toString().toInt()
            val res = n1 + n2
            textResultado.text = "Resultado: ${res.toString()}"
        }

        btnRestar.setOnClickListener {
            val n1 = edtN1.text.toString().toInt()
            val n2 = edtN2.text.toString().toInt()
            val res = n1 - n2
            textResultado.text = "Resultado: ${res.toString()}"
        }

        btnDividir.setOnClickListener {
            val n1 = edtN1.text.toString().toInt()
            val n2 = edtN2.text.toString().toInt()
            val res = n1 / n2
            textResultado.text = "Resultado: ${res.toString()}"
        }

        btnMult.setOnClickListener {
            val n1 = edtN1.text.toString().toInt()
            val n2 = edtN2.text.toString().toInt()
            val res = n1 * n2
            textResultado.text = "Resultado: ${res.toString()}"
        }



    }
}