package com.example.smda1

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class Createandsignup2Activity : AppCompatActivity() {

    private lateinit var openCameraIcon: ImageView

    // Register for gallery result
    private val pickImageLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val selectedImage: Uri? = result.data?.data
                // TODO: Display it or upload it, for example:
                // openCameraIcon.setImageURI(selectedImage)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.createandsignup_2)

        // Navigate to login page when the button is clicked
        val c = findViewById<Button>(R.id.button)
        c.setOnClickListener {
            val intent = Intent(this, Login24Activity::class.java)
            startActivity(intent)
        }

        // Set up gallery picker on camera icon click
        openCameraIcon = findViewById(R.id.opencamera)
        openCameraIcon.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            intent.type = "image/*"
            pickImageLauncher.launch(intent)
        }
    }
}
