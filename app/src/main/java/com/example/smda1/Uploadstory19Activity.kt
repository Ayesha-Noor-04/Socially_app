package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Uploadstory19Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.uploadstory_19)


        val btn=findViewById<ImageView>(R.id.poststory)

        btn.setOnClickListener{

            val intent= Intent(this,Jacobshome5Activity::class.java)
            startActivity(intent)
        }

        val btn1=findViewById<ImageView>(R.id.topbar)

        btn1.setOnClickListener{

            val intent= Intent(this,Jacobshome5Activity::class.java)
            startActivity(intent)
        }


    }
}