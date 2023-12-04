package com.tinyappco.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tinyappco.helloworld.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

<<<<<<< HEAD

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply { replace(R.id.fragmentContainerView, MainScreen()).commit() }


        }
=======
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main_screen)
    }
>>>>>>> 767e46b33894f4886e4c5b99185fadd60b36c13d
}
