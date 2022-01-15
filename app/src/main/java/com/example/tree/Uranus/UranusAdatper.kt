package com.example.tree.Uranus

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tree.Uranus.UranusImages.Uranus_first_image
import com.example.tree.Uranus.UranusImages.Uranus_second_image
import com.example.tree.Uranus.UranusImages.Uranus_third_fragment


class UranusAdatper(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            1 -> return Uranus_second_image()
            2 -> return Uranus_third_fragment()
        }
        return Uranus_first_image()
    }
}