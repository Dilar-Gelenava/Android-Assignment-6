package com.example.android_assignment_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val controller = findNavController(R.id.navHostFragment)
//        val bottomNavView = findViewById<BottomNavigationView>(R.id.nav_graph)
//
//        bottomNavView.setupWithNavController(controller)

    }

}