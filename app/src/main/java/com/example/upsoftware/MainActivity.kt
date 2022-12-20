package com.example.upsoftware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log.println
import com.example.upsoftware.activity.MainScreenActivity
import com.example.upsoftware.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler().postDelayed(Runnable {
            intent = Intent(this, MainScreenActivity::class.java)
            startActivity(intent)
            finish()
        },5000)



  //Write Git commits please !!!!!!
        println("First commit")
        println("Mistake commit")
        println("Signing commit")
    }
}