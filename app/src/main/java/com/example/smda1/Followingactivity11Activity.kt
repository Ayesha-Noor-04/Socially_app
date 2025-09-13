package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Followingactivity11Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.followingactivity_11)

        val bt=findViewById<RelativeLayout>(R.id.you)
        bt.setOnClickListener{

            val intent = Intent(this, youactivity_12::class.java)
            startActivity(intent)
        }

        val a=findViewById<LinearLayout>(R.id.one)
        a.setOnClickListener{

            val intent = Intent(this, Jacobshome5Activity::class.java)
            startActivity(intent)
        }

        val b=findViewById<LinearLayout>(R.id.two)
        b.setOnClickListener{

            val intent = Intent(this, Searcgpage6Activity::class.java)
            startActivity(intent)
        }

        val c=findViewById<LinearLayout>(R.id.three)
        c.setOnClickListener{

            val intent = Intent(this, Searcgpage6Activity::class.java)
            startActivity(intent)
        }

        val d=findViewById<LinearLayout>(R.id.four)
        d.setOnClickListener{

            val intent = Intent(this, Followingactivity11Activity::class.java)
            startActivity(intent)
        }
        val e=findViewById<LinearLayout>(R.id.five)
        e.setOnClickListener{

            val intent = Intent(this, Jacobsprofile13Activity::class.java)
            startActivity(intent)
        }

    }
}