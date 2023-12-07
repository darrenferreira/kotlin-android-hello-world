package com.tinyappco.helloworld

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class MainScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main_screen, container, false)


        val login = view.findViewById<Button>(R.id.btnLogin)
        val user = view.findViewById<EditText>(R.id.UserName)
        val password = view.findViewById<EditText>(R.id.UserPassword)

        login.setOnClickListener {

            if (user.text.isNotEmpty() && password.text.isNotEmpty()) {
                //buttonHandler(R.id.action_mainScreen_to_welcomeScreen, "The welcome screen")
                val input = user.text.toString()

                val bundle = Bundle()
                bundle.putString(NAME, input)

                //creating a variable to assign the welcome fragment
                val fragment = WelcomeScreen()
                fragment.arguments = bundle

                //taking data from the first fragment to second fragment
               fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainerView, fragment)?.commit()

            }
            if(user.text.isEmpty()) {
                user.error = "Please add text"
            }
            if(password.text.isEmpty()) {
                password.error = "Please add text"
            }
        }

        return view
    }
}
