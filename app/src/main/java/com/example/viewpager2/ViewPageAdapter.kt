package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.transition.FragmentTransitionSupport
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewPageAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment{
        return when (position) {
            0 -> firstframgent()
            1 -> secondfragment()
            2 -> thirdfragment()
            else -> firstframgent()
        }
    }

}

