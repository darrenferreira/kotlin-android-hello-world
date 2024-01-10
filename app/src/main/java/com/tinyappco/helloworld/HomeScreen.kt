package com.tinyappco.helloworld

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class HomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_open_compose, container, false)

        val openComposeBtn = view?.findViewById<Button>(R.id.button)

        openComposeBtn?.setOnClickListener {
            println("compose")
            val intent = Intent(context, ComposeActivity::class.java)
            this.startActivity(intent)
            println("compose")
        }

        return view
    }
}
