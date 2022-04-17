package com.example.navigationcomponentodev

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodev.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private val TAG = "AnasayfaFragment"
    private lateinit var binding:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)

        binding.btnGoA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gotoA)
        }

        binding.btnGoX.setOnClickListener {
            Log.i(TAG, "onCreateView: btnGoX")
            Navigation.findNavController(it).navigate(R.id.gotoX)
        }
        return binding.root
    }
}