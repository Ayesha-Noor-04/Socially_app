package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_3)

        val loginButton = findViewById<Button>(R.id.button)
        val signupText = findViewById<TextView>(R.id.signup)

        loginButton.setOnClickListener {
            val intent = Intent(this, Login24Activity::class.java)
            startActivity(intent)
        }

        signupText.setOnClickListener {
            val intent = Intent(this, Createandsignup2Activity::class.java)
            startActivity(intent)
        }

    }
}