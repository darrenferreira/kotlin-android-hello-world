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


class MainScreen : AppCompatActivity() {

    // creating variables for edit text and button on below line.
    lateinit var username: EditText
    lateinit var logIn: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main_screen)
        // initializing variable for video view on below line.
        username = findViewById(R.id.usernameText)
        logIn = findViewById(R.id.btnLogin)

        // adding click listener for button.
        logIn.setOnClickListener {
            val msg = username.text.toString()
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
}
