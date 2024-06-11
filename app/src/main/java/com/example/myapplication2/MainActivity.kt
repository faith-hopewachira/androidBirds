package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication2.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        var btnPrev2 = findViewById<ImageView>(R.id.btnPrev2)
        binding.btnPrev2.setOnClickListener({
            val intent = Intent(this,SecondBirdActivity::class.java)
            startActivity(intent)
        })


//        AFTER BINDING PASTE THE LINK INSIDE THE LOAD SO THAT THE IMAGE LOADS IN THE LAYOUT
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1555169062-013468b47731?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8YmlyZHxlbnwwfHwwfHx8MA%3D%3D")
            .into(binding.imageView3)

    }
}