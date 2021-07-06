package com.mavis.cane

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mavis.cane.databinding.ActivityHomeBinding
import com.mavis.cane.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var signupButtonInput : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        signupButtonInput = binding.sigupButton
        setContentView(binding.root)

        signupButtonInput.setOnClickListener {
            val intent: Intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }
}