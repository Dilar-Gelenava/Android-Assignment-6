package com.example.android_assignment_6.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.android_assignment_6.R

class DashboardFragment: Fragment(R.layout.fragment_dashboard) {

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView)

        textView.text = DashboardFragmentArgs.fromBundle(requireArguments())
    }
}