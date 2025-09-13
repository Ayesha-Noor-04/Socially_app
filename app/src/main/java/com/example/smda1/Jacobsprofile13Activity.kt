package com.example.smda1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class Jacobsprofile13Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.jacobsprofile_13)

        val story=findViewById<CircleImageView>(R.id.friends)


        story.setOnClickListener{

            val intent = Intent(this, Storyuploaded20Activity::class.java)
            startActivity(intent)
        }


        val w = findViewById<Button>(R.id.button)

        w.setOnClickListener {
            val intent = Intent(this, Editjacob15Activity::class.java)
            startActivity(intent)
        }
    }
}