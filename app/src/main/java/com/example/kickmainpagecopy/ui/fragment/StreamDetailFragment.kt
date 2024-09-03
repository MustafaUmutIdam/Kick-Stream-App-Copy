package com.example.kickmainpagecopy.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kickmainpagecopy.R
import com.example.kickmainpagecopy.databinding.FragmentStreamDetailBinding


class StreamDetailFragment : Fragment() {

    private lateinit var binding: FragmentStreamDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStreamDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

}