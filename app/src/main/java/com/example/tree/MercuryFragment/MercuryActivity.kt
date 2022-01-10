package com.example.tree.MercuryFragment

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tree.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MercuryActivity:AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mercury_activity)

//        val HomeFragment = HomeFragment()
//        val ElseFragment = ElseFragment()
//
//        firstPage(HomeFragment)
//
//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
//
//
//
//        bottomNavigationView.setOnItemReselectedListener {
//            when(it.itemId){
//                R.id.fragment_home -> firstPage(HomeFragment)
//                R.id.fragment_else -> firstPage(ElseFragment)
//            }
//            return@setOnItemReselectedListener
//        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        val fragment : NavController = findNavController(R.id.fragment_all)

        bottomNavigationView.setupWithNavController(fragment)


    }

//    private fun firstPage(fragment: Fragment) =
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.fragment_all, fragment)
//            commit()
//    }
}