package com.tinyappco.helloworld

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController

<<<<<<< HEAD
class MainScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
       container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View? {

        val view = inflater.inflate(R.layout.fragment_main_screen, container, false)



=======

class MainScreen : AppCompatActivity() {

    // creating variables for edit text and button on below line.
    lateinit var messageEdt: EditText
    lateinit var passDataBtn: Button
>>>>>>> 767e46b33894f4886e4c5b99185fadd60b36c13d

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main_screen)
        // initializing variable for video view on below line.
        messageEdt = findViewById(R.id.usernameText)
        passDataBtn = findViewById(R.id.btnLogin)

<<<<<<< HEAD
        login.setOnClickListener {
            //buttonHandler(R.id.action_mainScreen_to_welcomeScreen, "The welcome screen")
           val input=user.text.toString()

            val bundle=Bundle()
            bundle.putString(NAME,input)

            //creating a variable to assign the welcome fragment
            val fragment=WelcomeScreen()
            fragment.arguments=bundle

            //taking data from the first fragment to second fragment
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,fragment).commit()
            }



 }
        return view
}


/*private fun buttonHandler (navigationID: Int, name: String){
findNavController().navigate(navigationID)
Toast.makeText(this.context, "you've been navigated to $name :)", Toast.LENGTH_LONG).show()
}

 */
=======
        // adding click listener for button.
        passDataBtn.setOnClickListener {
            val msg = messageEdt.text.toString()

            // creating a bundle instance on below line
            val bundle = Bundle()
            // passing the data into the bundle
            bundle.putString(
                "message",
                msg
            )
            val intent = Intent(this@MainScreen, WelcomeScreen::class.java)
            // passing the bundle to the intent on below line.
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
>>>>>>> 767e46b33894f4886e4c5b99185fadd60b36c13d
}
