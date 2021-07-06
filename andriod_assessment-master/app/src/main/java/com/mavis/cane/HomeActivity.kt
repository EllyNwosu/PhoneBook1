package com.mavis.cane

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mavis.cane.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    private lateinit var nextPageButtonInput: Button
    private lateinit var previousPageButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        nextPageButtonInput = binding.nextPageButton
        previousPageButton = binding.previousPageButton
        setContentView(binding.root)

        nextPageButtonInput.setOnClickListener {
            val intent : Intent = Intent(this, ServicesActivity::class.java)
            startActivity(intent)
        }
        previousPageButton.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}