package com.mavis.games.models

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mavis.games.R
import com.mavis.games.databinding.ActivityPropertyBinding
import com.mavis.games.databinding.AnimalBinding

class PropertyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPropertyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPropertyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            imageAnimal.setImageResource(intent.getStringExtra("imageAnimal")!!.toInt())
            textfirstname.text = intent.getStringExtra("textfirstname")
            textsurname.text = intent.getStringExtra("textsurname")
        }
    }
}