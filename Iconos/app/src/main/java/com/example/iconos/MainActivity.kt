package com.example.iconos

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tb = findViewById<ToggleButton>(R.id.tb)
        val switch1 = findViewById<Switch>(R.id.switch1)
        val t1 = findViewById<TextView>(R.id.t1)
        val t2 = findViewById<TextView>(R.id.t2)

        tb.setOnClickListener {
            if (tb.isChecked)
                t1.setText("hola")
            else
                t1.setText("vale")

        }


        switch1.setOnClickListener{
            if (switch1.isChecked)
                t2.setText("hola")
            else
                t2.setText("vale")
        }





    }
}