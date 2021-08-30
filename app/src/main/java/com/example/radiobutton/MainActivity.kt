package com.example.radiobutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radio = findViewById<RadioGroup>(R.id.grupoDeRadios)

        val fondo = findViewById<LinearLayout>(R.id.back)

        radio.setOnCheckedChangeListener { grupo, idCliqueado ->
            when(idCliqueado){
                R.id.rojo ->{
                    fondo.setBackgroundColor(Color.parseColor("#FF0000"))
                }
                R.id.amarillo ->{
                    fondo.setBackgroundColor(Color.parseColor("#FFEDD21C"))
                }
                R.id.verde ->{
                    fondo.setBackgroundColor(Color.parseColor("#00FF00"))
                }
                R.id.naranja ->{
                    fondo.setBackgroundColor(Color.parseColor("#FF6600"))
                }
                R.id.azul ->{
                    fondo.setBackgroundColor(Color.parseColor("#0000FF"))
                }
                R.id.negro ->{
                    fondo.setBackgroundColor(Color.parseColor("#000000"))
                }
            }
        }

    }
}