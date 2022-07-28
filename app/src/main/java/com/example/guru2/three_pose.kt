package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent


class three_pose(contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {

 lateinit var textView: TextView
 lateinit var imageView3:ImageView
 lateinit var imageView4:ImageView
 lateinit var imageView5:ImageView
 lateinit var imageView6:ImageView
 lateinit var imageView7:ImageView

 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)

  textView=findViewById<TextView>(R.id.textView)

  imageView3 = findViewById<ImageView>(R.id.imageView3)
  imageView4 = findViewById<ImageView>(R.id.imageView4)
  imageView5 = findViewById<ImageView>(R.id.imageView5)
  imageView6 = findViewById<ImageView>(R.id.imageView6)
  imageView7 = findViewById<ImageView>(R.id.imageView7)


  imageView3.setImageResource(R.drawable.t_2)
  imageView4.setImageResource(R.drawable.t_1)
  imageView5.setImageResource(R.drawable.t_4)
  imageView6.setImageResource(R.drawable.t_5)
  imageView7.setImageResource(R.drawable.t_3)


 }

}