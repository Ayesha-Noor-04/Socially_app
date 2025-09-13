package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class youactivity_12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_youactivity12)


        val bt=findViewById<TextView>(R.id.following_text)

        bt.setOnClickListener{

            val intent = Intent(this, Followingactivity11Activity::class.java)
            startActivity(intent)
        }

        val b2=findViewById<TextView>(R.id.activity_textb)

        b2.setOnClickListener{

            val intent = Intent(this, Kyan21Activity::class.java)
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

            val intent = Intent(this, Postpicture16Activity::class.java)
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