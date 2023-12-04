package com.tinyappco.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
<<<<<<< HEAD

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
        val info=data?.getString(NAME)
        myTextView.text=info


        return view
    }
=======
import androidx.appcompat.app.AppCompatActivity

class WelcomeScreen : AppCompatActivity() {
    lateinit var messageTV: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_welcome_screen)
        messageTV = findViewById(R.id.usernameText)
        // getting the bundle from the intent
        val bundle = intent.extras
        messageTV.text = bundle!!.getString("message")
>>>>>>> 767e46b33894f4886e4c5b99185fadd60b36c13d

    }
}

