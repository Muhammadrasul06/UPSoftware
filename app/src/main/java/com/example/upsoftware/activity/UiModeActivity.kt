package com.example.upsoftware.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.upsoftware.R.id
import com.example.upsoftware.databinding.ActivityUiModeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class UiModeActivity : AppCompatActivity() {

    var bottomNavigationView: BottomNavigationView? = null


    lateinit var binding: ActivityUiModeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUiModeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bottomNavigationView = findViewById<BottomNavigationView>(id.bottomNavigationView)
        with(bottomNavigationView) { this!!.setBackground(null) }
    }
}