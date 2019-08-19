package com.app.bottomtabsnavigaion.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.app.bottomtabsnavigaion.Navigation2Directions
import com.app.bottomtabsnavigaion.R
import kotlinx.android.synthetic.main.fragment_include_c.*

class IncludeCFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_include_c, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(arguments?.getBoolean("auth", true) == true) {
            includeCButton.setOnClickListener { findNavController().navigate(Navigation2Directions.actionGlobalNavTabsFragment()) }
        } else {
            includeCButton.setOnClickListener {
                findNavController().navigateUp()
                findNavController().navigateUp()
                findNavController().navigateUp()
            }
        }
    }
}
