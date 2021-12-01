package com.kay.progayim

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), OnFragmentClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, Fragment1())
            .commit()
    }

    override fun onClick(enteredText: String) {
        val fragment2 = Fragment2()
        val bundle = Bundle()
        bundle.putString("key", enteredText)
        fragment2.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment2)
            .addToBackStack(Fragment2.TAG)
            .commit()
    }
}