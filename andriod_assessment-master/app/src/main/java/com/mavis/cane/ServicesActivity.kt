package com.mavis.cane

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mavis.cane.databinding.ActivityServicesBinding

class ServicesActivity : AppCompatActivity() {

    private lateinit var callButtonInput: Button
    private lateinit var binding: ActivityServicesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServicesBinding.inflate(layoutInflater)
        binding.apply {
            callButtonInput = callButton
        }
        setContentView(binding.root)
        callButtonInput.setOnClickListener {
            makeCall("07038644351")
        }
    }

    private fun makeCall (phoneNumber: String){
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel: $phoneNumber")
        }
        if (intent.resolveActivity(packageManager)  != null){
            startActivity(intent)
        }
    }
}