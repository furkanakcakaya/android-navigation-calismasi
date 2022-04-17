package com.example.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodev.databinding.FragmentBSayfasiBinding
import com.example.navigationcomponentodev.databinding.FragmentXSayfasiBinding

class XSayfasiFragment : Fragment() {
    private lateinit var binding: FragmentXSayfasiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentXSayfasiBinding.inflate(inflater,container,false)

        binding.btnGoYAtX.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.gotoYfromX)
        }

        return binding.root
    }
}