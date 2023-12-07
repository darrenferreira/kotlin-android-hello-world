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
                val input = user.text.toString()

                val bundle = Bundle()
                bundle.putString(NAME, input)

                val fragment = WelcomeScreen()
                fragment.arguments = bundle

<<<<<<< HEAD
                //taking data from the first fragment to second fragment
               fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainerView, fragment)?.commit()

=======
                parentFragmentManager.beginTransaction().apply {
                    replace(R.id.fragmentContainerView, fragment).commit()
                }
>>>>>>> 1de3f04cca395697256e6737b2784c0ff4e84287
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
