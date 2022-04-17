package com.example.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodev.databinding.FragmentBSayfasiBinding

class BSayfasiFragment : Fragment() {
    private lateinit var binding: FragmentBSayfasiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentBSayfasiBinding.inflate(inflater,container,false)

        binding.btnGoYAtB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gotoYfromB)
        }
        return binding.root
    }
}