package com.example.myherbal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class ginger : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ginger)

        val btnHome: ImageButton = findViewById(R.id.btnHome)
        val btnProducts: ImageButton = findViewById(R.id.btnProducts)
        val btnPlants: ImageButton = findViewById(R.id.btnPlants)
        val btnDoctor: ImageButton = findViewById(R.id.btnDoctor)
        val btnProfile: ImageButton = findViewById(R.id.btnProfile)

        val backButton : ImageButton = findViewById(R.id.backButton)

        btnHome.setOnClickListener {
            startActivity(Intent(this, Dashboard::class.java))
        }

        btnProducts.setOnClickListener {
            startActivity(Intent(this, Product::class.java))
        }

        btnPlants.setOnClickListener {
            startActivity(Intent(this, plant::class.java))
        }

        btnDoctor.setOnClickListener {
            startActivity(Intent(this, doctor::class.java))
        }

        btnProfile.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }

        backButton.setOnClickListener {
            startActivity(Intent(this, plant::class.java))
        }
    }
}