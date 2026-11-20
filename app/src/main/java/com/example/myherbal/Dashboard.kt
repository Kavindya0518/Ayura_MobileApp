package com.example.myherbal

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView


class Dashboard : AppCompatActivity() {

    private lateinit var btnHome: ImageButton
    private lateinit var btnProducts: ImageButton
    private lateinit var btnPlants: ImageButton
    private lateinit var btnDoctor: ImageButton
    private lateinit var btnProfile: ImageButton

    private lateinit var cardPlants: CardView
    private lateinit var cardProducts: CardView
    private lateinit var cardDoctor: CardView
    private lateinit var cardTreatment: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)


        // Footer buttons
        btnHome = findViewById(R.id.btnHome)
        btnProducts = findViewById(R.id.btnProducts)
        btnPlants = findViewById(R.id.btnPlants)
        btnDoctor = findViewById(R.id.btnDoctor)
        btnProfile = findViewById(R.id.btnProfile)

        // Cards
        cardPlants = findViewById(R.id.cardPlants)
        cardProducts = findViewById(R.id.cardProducts)
        cardDoctor = findViewById(R.id.cardDoctor)
        cardTreatment = findViewById(R.id.cardTreatment)

        // Highlight Home as current
        highlightCurrent(btnHome)

        // Footer button clicks
        btnHome.setOnClickListener { highlightCurrent(btnHome) }
        btnProducts.setOnClickListener {
            highlightCurrent(btnProducts)
            Toast.makeText(this, "Navigate to Products", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Product::class.java))
        }
        btnPlants.setOnClickListener {
            highlightCurrent(btnPlants)
            Toast.makeText(this, "Navigate to Plants", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, plant::class.java))
        }
        btnDoctor.setOnClickListener {
            highlightCurrent(btnDoctor)
            Toast.makeText(this, "Navigate to Doctor", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, doctor::class.java))
        }
        btnProfile.setOnClickListener {
            highlightCurrent(btnProfile)
            Toast.makeText(this, "Navigate to Profile/Cart", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Profile::class.java))
        }

        // Card clicks
        cardPlants.setOnClickListener {
            Toast.makeText(this, "Open Medicinal Plants", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, plant::class.java))
        }

        cardProducts.setOnClickListener {
            Toast.makeText(this, "Open Products", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Product::class.java))
        }

        cardDoctor.setOnClickListener {
            Toast.makeText(this, "Open Doctor Consultation", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, doctor::class.java))
        }
        cardTreatment.setOnClickListener {
            Toast.makeText(this, "Open Treatments", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Treatment::class.java))
        }
    }

    private fun highlightCurrent(selected: ImageButton) {
        val buttons = listOf(btnHome, btnProducts, btnPlants, btnDoctor, btnProfile)
        buttons.forEach { btn ->
            btn.setBackgroundResource(0)
            btn.setColorFilter(resources.getColor(R.color.primary_brown, null))
        }
        selected.setBackgroundResource(R.drawable.circle_background_selected)
        selected.setColorFilter(resources.getColor(R.color.white, null))
    }
}
