package com.example.ola.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById<ViewPager>(R.id.viewPager)
        if (viewPager != null) {
            val adapter = ViewPagerAdapter(supportFragmentManager)
            viewPager.adapter = adapter
        }

    }

    fun changeCurrentItem(i : Int){
        viewPager.currentItem = i
    }
}

/*<activity android:name=".Wskazowki">
</activity>
<activity android:name=".MojaCiaza">
</activity>
<activity android:name=".Kalendarz">
</activity>
<activity android:name=".ViewPagerAdapter">
</activity>*/