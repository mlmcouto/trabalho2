package com.example.trabalho02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button1MainAc1 =findViewById<Button>(R.id.button1_AcMain1)
        val Button1MainAc2 = findViewById<Button>(R.id.button2_AcMain1)

        Button1MainAc1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        Button1MainAc2.setOnClickListener {
            val intent = Intent (this, MainActivity3::class.java)
            startActivity(intent)
        }
    }

}
