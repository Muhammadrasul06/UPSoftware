package com.example.upsoftware.fragments.ui.Sale

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.upsoftware.R

class SaleFragment : Fragment() {

    companion object {
        fun newInstance() = SaleFragment()
    }

    private lateinit var viewModel: SaleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sale, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SaleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}