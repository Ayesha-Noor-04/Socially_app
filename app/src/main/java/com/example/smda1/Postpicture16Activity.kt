package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class Postpicture16Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.postpicture_16)

        val btn=findViewById<TextView>(R.id.photo)

        btn.setOnClickListener {
            val intent = Intent(this, Camera17Activity::class.java)
            startActivity(intent)
        }
        val btn1=findViewById<TextView>(R.id.cancel)

        btn1.setOnClickListener {
            val intent = Intent(this, Camera17Activity::class.java)
            startActivity(intent)
        }
        val btn2=findViewById<TextView>(R.id.next)

        btn2.setOnClickListener {
            val intent = Intent(this, Camera17Activity::class.java)
            startActivity(intent)
        }
    }
}