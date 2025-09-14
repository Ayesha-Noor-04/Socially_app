package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Internshaladm9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.internshaladm_9)

val btn=findViewById<ImageView>(R.id.videocall)

        btn.setOnClickListener {
            val intent = Intent(this, Call10Activity::class.java)
            startActivity(intent)
        }

        val btn1=findViewById<ImageView>(R.id.back)

        btn1.setOnClickListener {
            val intent = Intent(this, Searchpage7Activity::class.java)
            startActivity(intent)
        }


    }
}