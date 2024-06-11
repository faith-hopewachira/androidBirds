package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication2.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThirdBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)
//        val btnNext3 = findViewById<ImageView>(R.id.btnNext3)
//        val btnPrev2 = findViewById<ImageView>(R.id.btnPrev2)

        binding.btnPrev2.setOnClickListener{
            finish()
        }

        binding.btnNext3.setOnClickListener({
            val intent = Intent(this,FourthBirdActivity::class.java)
            startActivity(intent)
        })
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1497206365907-f5e630693df0?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .resize(1000, 1000)
            .centerInside()
            .into(binding.imageView5)
    }
}