package com.example.upsoftware.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.upsoftware.R
import com.example.upsoftware.R.*
import com.example.upsoftware.databinding.ActivityUiModeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class UiModeActivity : AppCompatActivity() {
    lateinit var binding: ActivityUiModeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUiModeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}