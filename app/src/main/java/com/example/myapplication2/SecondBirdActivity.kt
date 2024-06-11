package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication2.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)


        setContentView(binding.root)
//        val btnNext2 = findViewById<ImageView>(R.id.btnNext2)
//        val  btnPrev = findViewById<ImageView>(R.id.btnPrev2)

        binding.btnPrev2.setOnClickListener{
            finish()
        }

        binding.btnNext2.setOnClickListener({
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        })
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1518992028580-6d57bd80f2dd?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .resize(1000, 1000)
            .centerInside()
            .into(binding.imageView)


    }
}