package com.example.tree.Venera

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tree.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class VeneraActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.venera_activity)


//        val fragmentHomeVenera = fragment_home_venera()
//        val fragmentElseVenera = fragment_else_venera()
//
//        funnnc(fragmentHomeVenera)
//
//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_venera)
//        bottomNavigationView.setOnItemReselectedListener {
//            when(it.itemId){
//                R.id.fragment_home -> funnnc(fragmentHomeVenera)
//                R.id.fragment_else -> funnnc(fragmentElseVenera)
//            }
//            return@setOnItemReselectedListener
//        }
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_venera)

        val NavController : NavController = findNavController(R.id.fragment_venera)

        bottomNavigationView.setupWithNavController(NavController)
    }

//    private fun funnnc(fragmentHomeVenera: Fragment) = supportFragmentManager.beginTransaction().apply {
//
//        replace(R.id.fragment_venera, fragmentHomeVenera)
//        commit()
//
//    }


}

