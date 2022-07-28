package com.example.guru2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChooseRltshp : AppCompatActivity() {

    lateinit var lovers : Button
    lateinit var friends: Button
    lateinit var family :Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_rltshp)



        family=findViewById(R.id.family)
        family.setOnClickListener {
            val intent=Intent(this, Family::class.java)
            startActivity(intent)
        }

    }
}