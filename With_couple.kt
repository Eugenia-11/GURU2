package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class with_couple(contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {

    lateinit var textView: TextView
    lateinit var imageView1:ImageView
    lateinit var imageView2:ImageView
    lateinit var imageView3:ImageView
    lateinit var imageView4:ImageView
    lateinit var imageView5:ImageView
    lateinit var imageView6:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView=findViewById<TextView>(R.id.textView)

        imageView1 = findViewById<ImageView>(R.id.imageView1)
        imageView2 = findViewById<ImageView>(R.id.imageView2)
        imageView3 = findViewById<ImageView>(R.id.imageView3)
        imageView4 = findViewById<ImageView>(R.id.imageView4)
        imageView5 = findViewById<ImageView>(R.id.imageView5)
        imageView6 = findViewById<ImageView>(R.id.imageView6)

        imageView1.setImageResource(R.drawable.c_1)
        imageView2.setImageResource(R.drawable.c_2)
        imageView3.setImageResource(R.drawable.c_3)
        imageView4.setImageResource(R.drawable.c_4)
        imageView5.setImageResource(R.drawable.c_5)
        imageView6.setImageResource(R.drawable.c_6)

    }

}