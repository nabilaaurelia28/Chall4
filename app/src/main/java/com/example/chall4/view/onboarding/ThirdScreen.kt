package com.example.chall4.view.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.chall4.R
import com.example.chall4.databinding.FragmentThirdScreenBinding


class ThirdScreen : Fragment() {

    private var bind : FragmentThirdScreenBinding? = null
    private val binding get ()=bind!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentThirdScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFinish.setOnClickListener{
            findNavController().navigate(R.id.action_viewPager_to_loginFragment)
        }

    }



}