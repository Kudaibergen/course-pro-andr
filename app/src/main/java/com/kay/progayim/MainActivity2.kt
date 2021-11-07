package com.kay.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity(), OnButtonClicked {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onButtonClicked(enteredText: String) {
        val fragment2 = supportFragmentManager.findFragmentById(R.id.fragment_container2) as Fragment2
        fragment2.setText(enteredText)
    }
}