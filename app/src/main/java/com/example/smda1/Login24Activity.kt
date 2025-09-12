package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login24Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login2_4)

        val su=findViewById<TextView>(R.id.dhaasu)
        val logb=findViewById<Button>(R.id.loginbtn)

        su.setOnClickListener {
            val intent = Intent(this, Createandsignup2Activity::class.java)
            startActivity(intent)
        }

        logb.setOnClickListener {
            val intent = Intent(this, Jacobshome5Activity::class.java)
            startActivity(intent)
        }




    }
}