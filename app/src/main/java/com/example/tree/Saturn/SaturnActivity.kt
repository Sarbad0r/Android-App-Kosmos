package com.example.tree.Saturn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tree.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class SaturnActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.saturn_activity)

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_saturn)

        val  navController : NavController = findNavController(R.id.fragment_saturn)

        bottomNavigationView.setupWithNavController(navController)

    }
}