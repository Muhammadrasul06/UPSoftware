package com.example.upsoftware.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.upsoftware.R
import com.example.upsoftware.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.haveAccount.setOnClickListener {
            startActivity(Intent(this,SignInActivity::class.java))
        }
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this,UiModeActivity::class.java))
        }
    }
}