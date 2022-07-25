package com.example.guru2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ppl : AppCompatActivity() {

    lateinit var people2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ppl)


        people2.setOnClickListener{
            val intent = Intent(this,ppl2::class.java)
            startActivity(intent)
        }

    }
}