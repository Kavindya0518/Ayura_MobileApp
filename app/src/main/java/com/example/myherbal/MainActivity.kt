package com.example.myherbal

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // your XML file with logo

        // Show logo for 3 seconds, then go to Get Started Page
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Start_Page::class.java)
            startActivity(intent)
            finish() // close splash so user can't go back
        }, 3000) // 3000ms = 3 seconds
    }
}
