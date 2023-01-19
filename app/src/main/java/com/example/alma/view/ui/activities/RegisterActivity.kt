package com.example.alma.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.alma.R

class RegisterActivity : AppCompatActivity() {
    lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerButton = findViewById(R.id.registerButton)

        registerButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}