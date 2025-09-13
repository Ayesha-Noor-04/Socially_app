package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Jacobshome5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.jacobshome_5)


val sm=findViewById<ImageView>(R.id.send_icon)
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



        sm.setOnClickListener{

            val intent = Intent(this, Jacobsdms8Activity::class.java)
            startActivity(intent)
        }

        val story=findViewById<ImageView>(R.id.craigsstory)


        story.setOnClickListener{

            val intent = Intent(this, Craigstory18Activity::class.java)
            startActivity(intent)
        }

        val upload=findViewById<ImageView>(R.id.yourstory)


        upload.setOnClickListener{

            val intent = Intent(this, Uploadstory19Activity::class.java)
            startActivity(intent)
        }



    }
}