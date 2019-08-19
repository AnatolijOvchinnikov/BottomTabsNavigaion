package com.app.bottomtabsnavigaion.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.app.bottomtabsnavigaion.MainActivity
import com.app.bottomtabsnavigaion.R
import kotlinx.android.synthetic.main.fragment_include_a.*

class IncludeAFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_include_a, container, false)
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity).resetNavController()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        includeAButton.setOnClickListener { findNavController().navigate(IncludeAFragmentDirections.actionIncludeAFragmentToIncludeBFragment().setAuth(
            arguments?.getBoolean("auth", true)!!
        )) }
    }
}
