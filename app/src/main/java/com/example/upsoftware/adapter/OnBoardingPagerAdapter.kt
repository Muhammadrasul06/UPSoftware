package com.example.upsoftware.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.upsoftware.fragments.onBoardingScreen.FirstScreenFragment
import com.example.upsoftware.fragments.onBoardingScreen.SecondScreenFragment
import com.example.upsoftware.fragments.onBoardingScreen.ThirdScreenFragment

class OnBoardingPagerAdapter(fragment: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragment, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0-> {
                FirstScreenFragment()
            }
            1-> {
                SecondScreenFragment()
            }
            2-> {
                ThirdScreenFragment()
            }
            else->{
                FirstScreenFragment()
            }
        }
    }
}