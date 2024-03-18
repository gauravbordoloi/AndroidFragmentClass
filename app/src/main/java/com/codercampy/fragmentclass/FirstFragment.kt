package com.codercampy.fragmentclass

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codercampy.fragmentclass.databinding.FragmentFirstBinding

class FirstFragment: Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tv.setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.actionFragmentFirstToFragmentDetail(System.currentTimeMillis()))
        }

    }

    fun updateText(value: String) {
        binding.tv.text = value
    }

}