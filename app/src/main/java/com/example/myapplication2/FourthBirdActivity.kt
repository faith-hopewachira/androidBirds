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

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)


        setContentView(binding.root)
//        val  btnNext6 = findViewById<ImageView>(R.id.btnNext6)
//        val  btnPrev3 = findViewById<ImageView>(R.id.btnPrev3)


        binding.btnPrev2.setOnClickListener({
            finish()
        })

        binding.btnNext3.setOnClickListener({
            val intent = Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)
        })
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1606567595334-d39972c85dbe?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8YmlyZHxlbnwwfHwwfHx8MA%3D%3D")
            .resize(1000, 1000)
            .centerInside()
            .into((binding.imageView5))
    }
}