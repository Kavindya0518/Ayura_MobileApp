package com.example.myherbal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class Product : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val btnHome: ImageButton = findViewById(R.id.btnHome)
        val btnProducts: ImageButton = findViewById(R.id.btnProducts)
        val btnPlants: ImageButton = findViewById(R.id.btnPlants)
        val btnDoctor: ImageButton = findViewById(R.id.btnDoctor)
        val btnProfile: ImageButton = findViewById(R.id.btnProfile)

        btnHome.setOnClickListener {
            startActivity(Intent(this, Dashboard::class.java))
        }

        btnProducts.setOnClickListener {
            Snackbar.make(it, "You are already on Product screen", Snackbar.LENGTH_SHORT).show()
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


        setupBuyNowButtons()

        // Categories (these are TextViews in your XML)
        val catRecommend: TextView = findViewById(R.id.catRecommend)
        val catIndoor: TextView = findViewById(R.id.catIndoor)
        val catOutdoor: TextView = findViewById(R.id.catOutdoor)
        val catMedicinal: TextView = findViewById(R.id.catMedicinal)
        val catMedicinalplant: TextView = findViewById(R.id.catMedicinalplant)

        catRecommend.setOnClickListener {
            startActivity(Intent(this, Product::class.java))
        }

        catIndoor.setOnClickListener {
            startActivity(Intent(this, Product2::class.java))
        }

        catOutdoor.setOnClickListener {
            //startActivity(Intent(this, SkinHairActivity::class.java))
        }

        catMedicinal.setOnClickListener {
            //startActivity(Intent(this, PainReliefActivity::class.java))
        }

        catMedicinalplant.setOnClickListener {
            //startActivity(Intent(this, WellnessActivity::class.java))
        }


    }


    private fun setupBuyNowButtons() {
        // Categories (TextViews)
        val btns = listOf(
            R.id.catRecommend,
            R.id.catIndoor,
            R.id.catOutdoor,
            R.id.catMedicinal,
            R.id.catMedicinalplant
        )

        btns.forEach { id ->
            findViewById<TextView>(id).setOnClickListener {
                Snackbar.make(it, "Clicked on ${(it as TextView).text}", Snackbar.LENGTH_SHORT).show()
            }
        }

        // Example "Read More" button (make sure you added android:id="@+id/readMoreBtn1" in XML)
        val buyNowbtn1: Button = findViewById(R.id.buyNowbtn1)
        buyNowbtn1.setOnClickListener {
            val intent = Intent(this, Face_pack::class.java)
            startActivity(intent)
        }
    }
}