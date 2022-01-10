package com.example.tree.Earth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tree.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.NonCancellable.start

class EarthActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.earth_activity)

//
//        val fragmentHomeEarth = fragment_home_earth()
//        val fragmentEleseEarth = fragment_elese_earth()
//        start(fragmentHomeEarth)
//
//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_earth)
//        bottomNavigationView.setOnItemReselectedListener {
//            when(it.itemId){
//                R.id.fragment_home -> start(fragmentHomeEarth)
//                R.id.fragment_else -> start(fragmentEleseEarth)
//            }
//        }

        val bottomNav : BottomNavigationView = findViewById(R.id.bottom_navigation_earth)

        val navController : NavController = findNavController(R.id.frame_earth)

        bottomNav.setupWithNavController(navController)

    }

//    private fun start(fragmentHomeEarth: Fragment) = supportFragmentManager.beginTransaction().apply{
//
//        replace(R.id.frame_earth , fragmentHomeEarth)
//        commit()
//
//    }

}