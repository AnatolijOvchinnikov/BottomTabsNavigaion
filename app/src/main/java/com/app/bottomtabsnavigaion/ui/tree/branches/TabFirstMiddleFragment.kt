package com.app.bottomtabsnavigaion.ui.tree.branches


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.app.bottomtabsnavigaion.R
import kotlinx.android.synthetic.main.fragment_tab_first.*

class TabFirstMiddleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_first_middle, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btn_tab_first.setOnClickListener { findNavController().navigate(TabFirstMiddleFragmentDirections.actionTabFirstMiddleFragmentToTabFirstHighFragment()) }
    }
}
