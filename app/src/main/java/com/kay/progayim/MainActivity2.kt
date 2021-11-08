package com.kay.progayim

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(), OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)
    }

    override fun onClicked(text: String) {
        val fragment2 = supportFragmentManager.findFragmentById(R.id.act2_container2) as? Fragment2
        fragment2?.setValue(text)

        val fragment1 = supportFragmentManager.findFragmentById(R.id.act2_container1) as? Fragment1
        fragment1?.setValue(text)
    }
}