package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication2.databinding.ActivityFifthBirdBinding
import com.example.myapplication2.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)
//        val btnPrev4 = findViewById<ImageView>(R.id.btnPrev4)

        binding.btnPrev4.setOnClickListener({
            finish()
        })
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1539664030485-a936c7d29c6e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8YmlyZHxlbnwwfHwwfHx8MA%3D%3D")
            .resize(2800, 2000)
            .centerInside()
            .into(binding.imageView2)
    }
}