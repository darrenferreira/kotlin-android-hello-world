package com.tinyappco.helloworld

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class WelcomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_welcome_screen, container, false)

        val myTextView = view.findViewById<TextView>(R.id.usernameText)

        val data = arguments
        val info = data?.getString(NAME)
        myTextView.text = info

        val firstFragment=MainScreen()
        val secondFragment=WelcomeScreen()
        val thirdFragment=ComposeFragment()
        val bottomNavigationView=view.findViewById<BottomNavigationView>(R.id.bottomNavigationView1)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(thirdFragment)
            }
            true
        }
        return view
    }
    private fun setCurrentFragment(fragment1:Fragment)=
        fragmentManager?.beginTransaction()?.apply { replace(R.id.fragmentContainerView,fragment1).commit()}

}