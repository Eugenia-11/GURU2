package com.example.guru2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ppl : AppCompatActivity() {

    lateinit var people2 : Button
    lateinit var peoplem: Button
    lateinit var people34:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ppl)


        people2 = findViewById(R.id.people2)
        people2.setOnClickListener{
            val intent = Intent(this,ppl2::class.java)
            startActivity(intent)
        }

        people34=findViewById(R.id.people34)
        people34.setOnClickListener {
            val intent=Intent(this,three_pose::class.java)
            startActivity(intent)
        }

        peoplem = findViewById(R.id.peoplem)
        peoplem.setOnClickListener{
            val intent=Intent(this,pplm::class.java)
            startActivity(intent)
        }


    }
}