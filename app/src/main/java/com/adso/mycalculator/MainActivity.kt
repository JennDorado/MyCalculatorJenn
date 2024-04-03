package com.adso.mycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adso.mycalculator.R.id.main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnWelcome = findViewById<Button>(R.id.btnWelcome)
        btnWelcome.setOnClickListener {
            Toast.makeText(this@MainActivity, "Hola, Calcula", Toast.LENGTH_SHORT).show()
            // Iniciar la segunda actividad
            val intent = Intent(/* packageContext = */ this@MainActivity, /* cls = */ ButtonActivity::class.java)
            startActivity(intent)
        }

    }

    class ButtonActivity {

    }
}