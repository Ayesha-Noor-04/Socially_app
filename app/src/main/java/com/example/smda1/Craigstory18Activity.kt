package com.example.smda1

import android.os.Bundle
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Craigstory18Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.craigstory_18)


        android.os.Handler(Looper.getMainLooper()).postDelayed({
            finish()   // returns to previous screen (Jacobshome)
        }, 4000)      // 4000 ms = 4 seconds

    }
}