package com.example.list_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.list_kotlin.adapter.Viewpage_Adapter
import com.example.list_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpTabs()

    }
    private fun setUpTabs(){
        val adapter = Viewpage_Adapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(),"home")
        adapter.addFragment(UserFragment(),"user")
        adapter.addFragment(HomeFragment(),"home")
        adapter.addFragment(UserFragment(),"user")
        binding.viewpage.adapter = adapter
        binding.ab.setupWithViewPager(binding.viewpage)
        binding.ab.getTabAt(0)!!.setIcon(R.drawable.home_24)
        binding.ab.getTabAt(1)!!.setIcon(R.drawable.account_circle_24)
        binding.ab.getTabAt(2)!!.setIcon(R.drawable.home_24)
        binding.ab.getTabAt(3)!!.setIcon(R.drawable.account_circle_24)



    }
}