package com.codercampy.fragmentclass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.codercampy.fragmentclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.first_container) as NavHostFragment
        navController = navHostFragment.navController

        binding.bottomNavigationView.setOnItemSelectedListener {
            if (it.itemId == R.id.nav_search) {
               navController.navigate(R.id.navDirectToSearch)
            } else if (it.itemId == R.id.nav_home) {
                navController.navigate(R.id.navDirectToHome)
            }
            return@setOnItemSelectedListener true
        }

//        binding.tvFirst.setOnClickListener {

//        }

//        supportFragmentManager.beginTransaction()
//            .replace(binding.firstContainer.id, FirstFragment())
//            .commit()
//
//        supportFragmentManager.beginTransaction()
//            .replace(binding.secondContainer.id, SecondFragment())
//            .commit()


    }

}