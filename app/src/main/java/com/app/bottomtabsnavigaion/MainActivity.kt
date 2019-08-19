package com.app.bottomtabsnavigaion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigation()
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    fun overrideNavController(navController: NavController) {
        this.navController = navController
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    fun resetNavController() {
        setupNavigation()
    }

    fun getNavController(): NavController = navController

    private fun setupNavigation() {
        navController = findNavController(R.id.nav_host_fragment)
        // Update action bar to reflect navigation
        NavigationUI.setupActionBarWithNavController(this, navController)
    }
}
