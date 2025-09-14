package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Searchpage7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.searchpage_7)


        val btn=findViewById<RelativeLayout>(R.id.internshaladm)

        btn.setOnClickListener{

            val intent= Intent(this,Internshaladm9Activity::class.java)
            startActivity(intent)

        }


        val btn1=findViewById<ImageView>(R.id.crossicon)

        btn1.setOnClickListener{

            val intent= Intent(this,Searcgpage6Activity::class.java)
            startActivity(intent)

        }
    }
}