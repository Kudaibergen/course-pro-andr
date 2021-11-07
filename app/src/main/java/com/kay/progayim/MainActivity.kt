package com.kay.progayim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity(), OnButtonClicked {
    private lateinit var txt: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()

        txt = findViewById(R.id.txt_1)
        val edit = findViewById<AppCompatEditText>(R.id.act_edit)
        val btn = findViewById<AppCompatButton>(R.id.btn)

//        btn.setOnClickListener {
//            val fragment1 = supportFragmentManager.findFragmentById(R.id.fragment) as? Fragment1
//            fragment1?.setText(edit.text.toString())
//
//            fragment1 as MainActivity
//        }

        btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onButtonClicked(enteredText: String) {
        txt.text = enteredText
    }

    private fun initFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment, FragmentActivityMain())
            .commit()
    }
}