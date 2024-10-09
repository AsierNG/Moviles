package com.example.app1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonP = findViewById<Button>(R.id.buttonP)
        buttonP.setOnClickListener {
            Log.i("MainActivity","TSSIIIII")
            Toast.makeText(this,"Calculando el Pinchito...",Toast.LENGTH_LONG).show()

        }
    }
}