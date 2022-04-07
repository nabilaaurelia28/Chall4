package com.example.chall4.view.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainer
import com.example.chall4.R
import com.example.chall4.adapter.ViewPagerAdapter
import com.example.chall4.databinding.FragmentViewPagerBinding

class ViewPager : Fragment() {
    private var bind:FragmentViewPagerBinding? = null
    private val binding get()=bind!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bind = FragmentViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listFragment = arrayListOf<Fragment>(
            FirstScreen(),
            SecScreen(),
            ThirdScreen()
        )
        val adapter = ViewPagerAdapter(
            listFragment,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.vpOnBoarding.adapter = adapter
    }



}