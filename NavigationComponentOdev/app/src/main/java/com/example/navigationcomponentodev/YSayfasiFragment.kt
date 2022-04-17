package com.example.navigationcomponentodev

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodev.databinding.FragmentYSayfasiBinding

class YSayfasiFragment : Fragment() {
    private val TAG = "YSayfasiFragment"

    private lateinit var binding: FragmentYSayfasiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentYSayfasiBinding.inflate(inflater,container,false)

        binding.btnGoBack.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.gotoAnasayfa)
        }

        return binding.root
    }

    fun onBackPressed(): Boolean {
        Log.i(TAG, "onBackPressed: ??")
        activity?.onBackPressed()
        return true
    }

}