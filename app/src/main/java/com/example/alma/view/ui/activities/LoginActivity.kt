package com.example.alma.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.alma.R

class LoginActivity : AppCompatActivity() {
    // variables para accion del login
    lateinit var homeButton: Button
    lateinit var registerButton: Button
    //lateinit var recoverTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // asociacion de la variable al elemento en el login
        homeButton = findViewById(R.id.loginButtonHome)
        registerButton = findViewById(R.id.loginButtonRegister)
        val recoverTextView = findViewById<TextView>(R.id.loginRecoverPassword) // la otra forma de realizarlo, de este modo se hace en una sola linea

        // programacion para dar click y lo lleve a donde se le indique con OnCLick
        homeButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        registerButton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
        recoverTextView.setOnClickListener {
            startActivity(Intent(this, RecoverActivity::class.java))
        }

    }
}