package com.tinyappco.helloworld

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class WelcomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_welcome_screen, container, false)


        // Finds the TextView in the welcome fragment
        val myTextView = view.findViewById<TextView>(R.id.usernameText)

        // Gets the data from the passed bundle
        val data = arguments
        val info = data?.getString(NAME)
        myTextView.text = info


        return view
    }
}