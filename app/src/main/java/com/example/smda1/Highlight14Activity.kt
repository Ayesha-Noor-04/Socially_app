package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Highlight14Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.highlight_14)


        val w = findViewById<ImageView>(R.id.crossbutton)

        w.setOnClickListener {
            val intent = Intent(this, Jacobsprofile13Activity::class.java)
            startActivity(intent)
        }

    }
}