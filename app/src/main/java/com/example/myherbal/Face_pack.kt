package com.example.myherbal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class Face_pack : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_face_pack)
        val btnHome: ImageButton = findViewById(R.id.btnHome)
        val btnProducts: ImageButton = findViewById(R.id.btnProducts)
        val btnPlants: ImageButton = findViewById(R.id.btnPlants)
        val btnDoctor: ImageButton = findViewById(R.id.btnDoctor)
        val btnProfile: ImageButton = findViewById(R.id.btnProfile)

        val backButton : ImageButton = findViewById(R.id.btnBack2)


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
            startActivity(Intent(this, Product::class.java))
        }

        setupAddCart()

    }

    private fun setupAddCart() {

        // Example "Read More" button (make sure you added android:id="@+id/readMoreBtn1" in XML)
        val btnAddToCart: Button = findViewById(R.id.btnAddToCart)
        btnAddToCart.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}


