package com.tinyappco.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeScreen : AppCompatActivity() {
    lateinit var usernameMessage: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_welcome_screen)
        usernameMessage = findViewById(R.id.usernameText)
        // getting the bundle from the intent
        val bundle = intent.extras
        usernameMessage.text = bundle!!.getString("message")

    }
}
