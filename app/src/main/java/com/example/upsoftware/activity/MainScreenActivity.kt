package com.example.upsoftware.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.upsoftware.R
import com.example.upsoftware.adapter.OnBoardingPagerAdapter
import com.example.upsoftware.databinding.ActivityMainScreenBinding

class MainScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainScreenBinding
    lateinit var pagerAdapter: OnBoardingPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pagerAdapter = OnBoardingPagerAdapter(supportFragmentManager, lifecycle)
        binding.ViewPager.adapter = pagerAdapter
        
        binding.btnBack.setOnClickListener {
            binding.ViewPager.currentItem = removeItem(1)
        }

        binding.btnNext.setOnClickListener {
            if (binding.ViewPager.currentItem==2){
                Toast.makeText(this, "Succes", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,SignInActivity::class.java))
            }else{
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
            binding.ViewPager.currentItem = getItem(1)
        }

    }

    fun getItem(i: Int): Int {
        return binding.ViewPager.currentItem + i
    }

    fun removeItem(j: Int): Int {
        return binding.ViewPager.currentItem - j
    }

}