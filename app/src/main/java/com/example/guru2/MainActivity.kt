package com.example.guru2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    lateinit var cameraButton: Button
    lateinit var button1 : Button
    lateinit var button2:Button
    lateinit var button3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      button1 = findViewById(R.id.button1)

       button1.setOnClickListener{
            val intent = Intent(this, ppl::class.java)
            startActivity(intent)

        }

        cameraButton = findViewById(R.id.cameraButton)

        cameraButton.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent=Intent(this,ChooseRltshp::class.java)
            startActivity(intent)
        }

        button3=findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent=Intent(this,Props::class.java)
            startActivity(intent)
        }

    }
}