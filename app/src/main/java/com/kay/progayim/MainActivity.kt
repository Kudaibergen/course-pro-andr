package com.kay.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {
    private lateinit var txt: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt = findViewById(R.id.count)
        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
        val btn3 = findViewById<AppCompatButton>(R.id.btn3)
        val btn4 = findViewById<AppCompatButton>(R.id.btn4)

        txt.text = supportFragmentManager.backStackEntryCount.toString()
        supportFragmentManager.addOnBackStackChangedListener {
            txt.text = supportFragmentManager.backStackEntryCount.toString()
        }

        btn1.setOnClickListener(::onClick)
        btn2.setOnClickListener(::onClick)
        btn3.setOnClickListener(::onClick)

        btn4.setOnClickListener {
            supportFragmentManager.popBackStack(Fragment2.TAG, 0)
        }
    }

    private fun onClick(v: View) {
        val transaction = supportFragmentManager.beginTransaction()

        val pair = when(v.id) {
            R.id.btn1 -> {
                Fragment1() to Fragment1.TAG
            }
            R.id.btn2 -> {
                Fragment2() to Fragment2.TAG
            }
            else -> Fragment3() to Fragment3.TAG
        }

        transaction.add(R.id.fragment_container, pair.first, pair.second)
        transaction.addToBackStack(pair.second)
        transaction.commit()
    }
}