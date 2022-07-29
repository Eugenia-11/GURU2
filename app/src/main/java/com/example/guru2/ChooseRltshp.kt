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



        friends=findViewById(R.id.friends)
        friends.setOnClickListener{
            val intent=Intent(this, With_friend::class.java)
            startActivity(intent)
        }




        family=findViewById(R.id.family)
        family.setOnClickListener {
            val intent=Intent(this, Family::class.java)
            startActivity(intent)
        }

    }
}