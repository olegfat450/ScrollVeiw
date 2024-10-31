package com.example.scrollveiw

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

        private lateinit var textTv: TextView
        private lateinit var button: Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textTv = findViewById(R.id.textTv)
        button = findViewById(R.id.button)}

     fun onButtonClick(v: View) {

         val text = database().loadBook()

         textTv.setTextColor(resources.getColor(R.color.black))
         textTv.setTextSize(22f)
         text.forEach{ textTv.append("${it} ") }


     }


    }
