package com.example.myherbal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // "Already have an account? Sign In" click
        val tvSignIn = findViewById<TextView>(R.id.tvAlreadyAccount)
        tvSignIn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        // Optional: Sign Up button click to proceed (maybe to dashboard)
        val btnSignup = findViewById<Button>(R.id.btnSignup)
        btnSignup.setOnClickListener {
            // Here you can add signup logic, then move to login or dashboard
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}
