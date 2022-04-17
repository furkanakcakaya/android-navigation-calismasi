package com.example.navigationcomponentodev

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodev.databinding.FragmentASayfasiBinding

class ASayfasiFragment : Fragment() {
    private lateinit var binding: FragmentASayfasiBinding
     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
         binding = FragmentASayfasiBinding.inflate(inflater,container,false)

         binding.btnGoB.setOnClickListener{
             Navigation.findNavController(it).navigate(R.id.gotoB)
         }

         return binding.root
    }
}