package com.example.appcompartirdatos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtMensaje = findViewById<EditText>(R.id.edtMensaje)
        val mensaje : String = edtMensaje.text.toString()
        val btnDirecto = findViewById<Button>(R.id.btnDirecto)
        btnDirecto.setOnClickListener {
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG)
        }
        val btnElige = findViewById<Button>(R.id.btnElige)
        btnElige.setOnClickListener {
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG)
        }

    }
}