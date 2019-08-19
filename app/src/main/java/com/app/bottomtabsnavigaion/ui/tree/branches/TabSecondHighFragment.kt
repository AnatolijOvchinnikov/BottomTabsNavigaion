package com.app.bottomtabsnavigaion.ui.tree.branches


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.app.bottomtabsnavigaion.MainActivity
import com.app.bottomtabsnavigaion.R
import kotlinx.android.synthetic.main.fragment_tab_first.*

class TabSecondHighFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_second_high, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        (activity as MainActivity).resetNavController()
//        btn_tab_first.setOnClickListener { findNavController().navigate(TabSecondHighFragmentDirections.actionTabSecondHighFragmentToNavInclude()) }
        btn_tab_first.setOnClickListener { (activity as MainActivity).findNavController(R.id.nav_host_fragment).navigate(R.id.nav_include, bundleOf("auth" to false)) }
    }
}
