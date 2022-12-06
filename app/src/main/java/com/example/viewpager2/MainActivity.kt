package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabBar: TabLayout
    private lateinit var viewPager: ViewPager2
    private lateinit var viewPagerFragmentAdapter: ViewPageAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabBar = findViewById(R.id.tabBar)
        viewPager = findViewById(R.id.viewpager)

        viewPagerFragmentAdapter = ViewPageAdapter(this)



        viewPager.adapter = viewPagerFragmentAdapter

        TabLayoutMediator(tabBar, viewPager) {tab, position ->
            tab.text = "Tab" + (position + 1)
        }.attach()

    }
}