package com.example.navigationcomponentodev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationcomponentodev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var design:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}