package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Editjacob15Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.editjacob_15)

        val a = findViewById<TextView>(R.id.done)

        a.setOnClickListener {
            val intent = Intent(this, Jacobsprofile13Activity::class.java)
            startActivity(intent)
        }

        val b = findViewById<TextView>(R.id.cancel)

        b.setOnClickListener {
            val intent = Intent(this, Jacobsprofile13Activity::class.java)
            startActivity(intent)
        }


    }
}