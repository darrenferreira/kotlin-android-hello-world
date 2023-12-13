package com.tinyappco.helloworld

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment


class HomeScreen : Fragment(R.layout.fragment_open_compose) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val openComposeBtn = view?.findViewById<Button>(R.id.button)

        openComposeBtn?.setOnClickListener {
            val intent = Intent(context, ComposeActivity::class.java)
            this.startActivity(intent)
            println("compose")
        }
    }
}
