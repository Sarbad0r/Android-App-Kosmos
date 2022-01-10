package com.example.tree.Mars

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tree.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.NonCancellable.start

class MarsActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mars_activity)

//        val fragment_else_mars = fragment_else_mars()
//        val fragmentHomeMars = fragment_home_mars()
//        start(fragmentHomeMars)
//
//
//        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_mars)
//        bottomNavigationView.setOnItemReselectedListener {
//            when(it.itemId){
//                R.id.fragment_home -> start(fragmentHomeMars)
//                R.id.fragment_else -> start(fragment_else_mars)
//            }
//        }

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_mars)

        val navController : NavController = findNavController(R.id.frame_mars)

        bottomNavigationView.setupWithNavController(navController)


    }

//    private fun start(fragmentHomeMars: Fragment) = supportFragmentManager.beginTransaction().apply {
//        replace(R.id.frame_mars, fragmentHomeMars)
//        commit()
//    }
}