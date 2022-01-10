package com.example.tree.Jupiter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tree.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class JupiterActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jupiter_activity)
        
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_jupiter)

        val navController : NavController = findNavController(R.id.fragment_jupiter)

        bottomNavigationView.setupWithNavController(navController)
        
    }

}