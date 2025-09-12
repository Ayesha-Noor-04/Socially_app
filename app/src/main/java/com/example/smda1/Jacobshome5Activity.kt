package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Jacobshome5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.jacobshome_5)

val b=findViewById<ImageView>(R.id.tabbari)
val sm=findViewById<ImageView>(R.id.send_icon)
        b.setOnClickListener{

            val intent = Intent(this, Searcgpage6Activity::class.java)
            startActivity(intent)
        }

        sm.setOnClickListener{

            val intent = Intent(this, Jacobsdms8Activity::class.java)
            startActivity(intent)
        }


    }
}