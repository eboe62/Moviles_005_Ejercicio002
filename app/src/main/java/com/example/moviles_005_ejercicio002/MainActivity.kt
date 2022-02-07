package com.example.moviles_005_ejercicio002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            button.setOnClickListener {
                val nro1 = et1.text.toString().toInt()
                val nro2 = et2.text.toString().toInt()
                val suma = nro1 + nro2
                tv1.text = "Resultado: ${suma.toString()}"
            }
        }

        override fun onStart() {
            super.onStart()
            Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        }

        override fun onResume() {
            super.onStart()
            Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
        }

        override fun onPause() {
            super.onStart()
            Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
        }

        override fun onStop() {
            super.onStart()
            Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        }
        override fun onRestart() {
            super.onStart()
            Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
        }

        override fun onDestroy() {
            super.onStart()
            Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        }
}