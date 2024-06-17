package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication2.databinding.ActivityFourthBirdBinding
import com.example.myapplication2.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)


        setContentView(binding.root)
//        val  btnNext6 = findViewById<ImageView>(R.id.btnNext6)
//        val  btnPrev3 = findViewById<ImageView>(R.id.btnPrev3)


        binding.btnPrev3.setOnClickListener({
            finish()
        })

        binding.btnNext6.setOnClickListener({
            val intent = Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)

        })
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1606567595334-d39972c85dbe?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8YmlyZHxlbnwwfHwwfHx8MA%3D%3D")
//            .centerInside()
//            .resize(1000, 1000)
            .into(binding.imageView8)
    }
}