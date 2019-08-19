package com.app.bottomtabsnavigaion.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.app.bottomtabsnavigaion.MainActivity
import com.app.bottomtabsnavigaion.R
import kotlinx.android.synthetic.main.fragment_nav_tabs.*

class NavTabsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_tabs, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val navController = Navigation.findNavController(activity as MainActivity, R.id.bottomNavFragment)
        bottomNavigation.setupWithNavController(navController)
        NavigationUI.setupActionBarWithNavController(activity as MainActivity, navController)

        (activity as MainActivity).overrideNavController(navController)
    }

}
