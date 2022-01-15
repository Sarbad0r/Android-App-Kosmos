package com.example.tree.Uranus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tree.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class UranusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.uranus_activity)


        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_uranus)

        val navController : NavController = findNavController(R.id.fragment_uranus)

        bottomNavigationView.setupWithNavController(navController)


    }
}