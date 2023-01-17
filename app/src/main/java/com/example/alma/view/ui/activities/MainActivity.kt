package com.example.alma.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.alma.R
import com.example.alma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // binding hace asociacion para ejecutar la animacion creado en el layout del activity_main
    lateinit var handler: Handler  // para hacer el seguimiento de ejecucion del binding, que pasa despues de ejecutar la animacion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // inflate ejecuta, llama
        setContentView(binding.root)

        // intanciacion de la animacion
        binding.viewAnimation.setAnimation(R.raw.womenanimation)
        binding.viewAnimation.playAnimation()

        // ejecucion de los procesos de ruta
        // configuracion para que la transicion entre la animacion y la siguiente activity se realice en 4 segundos
        handler = Handler(Looper.myLooper()!!)
        handler.postDelayed(
            {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }, 6000)
    }
}