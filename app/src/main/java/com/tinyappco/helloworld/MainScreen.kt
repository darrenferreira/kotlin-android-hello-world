package com.tinyappco.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class MainScreen : Fragment(R.layout.fragment_main_screen) {

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
//
//        val view = inflater.inflate(R.layout.fragment_main_screen, container, false)
//
//        val login = view.findViewById<Button>(R.id.btnGreet)
//
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val login = view.findViewById<Button>(R.id.btnGreet)
        val user=view.findViewById<EditText>(R.id.UserName)
        val password=view.findViewById<EditText>(R.id.UserPassword)

        login.setOnClickListener {
            buttonHandler(R.id.action_mainScreen_to_welcomeScreen, "the welcome screen")
        }
    }

    private fun buttonHandler (navigationID: Int, name: String){
        findNavController().navigate(navigationID)
        Toast.makeText(this.context, "you've been navigated to $name :)", Toast.LENGTH_LONG).show()
    }
}
