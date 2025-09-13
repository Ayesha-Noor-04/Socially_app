package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Camera17Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.camera_17)

        val btn=findViewById<ImageView>(R.id.done)

        btn.setOnClickListener {
            val intent = Intent(this, Jacobshome5Activity::class.java)
            startActivity(intent)
        }
    }
}