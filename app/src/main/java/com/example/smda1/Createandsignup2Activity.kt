package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Createandsignup2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.createandsignup_2)

        val c=findViewById<Button>(R.id.button)

        c.setOnClickListener{
            val intent = Intent(this, Login24Activity::class.java)
            startActivity(intent)
        }

    }
}