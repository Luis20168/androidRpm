package com.example.motoviajeros.home.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.motoviajeros.R
import com.example.motoviajeros.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

     private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intUI()
    }

    private fun intUI() {
        initNavigation()
    }

    private fun initNavigation() {
        val navHost= supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController= navHost.navController
        binding.bottomMenu.setupWithNavController(navController)
    }


}