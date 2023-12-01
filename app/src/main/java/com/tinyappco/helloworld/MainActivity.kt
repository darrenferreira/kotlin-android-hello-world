package com.tinyappco.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tinyappco.helloworld.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main_screen)
    }
}
