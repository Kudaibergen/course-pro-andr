package com.kay.progayim

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.kay.progayim.MainActivity3.Companion.ACTION_1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<AppCompatButton>(R.id.btn_1)
        val btn2 = findViewById<AppCompatButton>(R.id.btn_2)
        val btn3 = findViewById<AppCompatButton>(R.id.btn_3)
        val btn4 = findViewById<AppCompatButton>(R.id.btn_4)
        val btn5 = findViewById<AppCompatButton>(R.id.btn_5)

        btn1.setOnClickListener { goTo1() }
        btn2.setOnClickListener { goToWeb() }
        btn3.setOnClickListener { goToGallery() }
        btn4.setOnClickListener { goToActivityWithAction1() }
        btn5.setOnClickListener { goToActivityWithAction2() }
    }

    private fun goTo1() {
        val intent = Intent("myAction")
        startActivity(intent)
    }

    private fun goToWeb() {
        val address = Uri.parse("http://google.com")
        val intent = Intent(Intent.ACTION_VIEW, address)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "asdasdas", Toast.LENGTH_SHORT).show()
        }
    }

    private fun goToGallery() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.type = "image/*"
        startActivity(intent)
    }

    private fun goToActivityWithAction1() {
        val intent = Intent(ACTION_1)
        intent.putExtra("key", "CCCc")
        startActivity(intent)
    }

    private fun goToActivityWithAction2() {
        val intent = Intent("action2")
        intent.putExtra("key", "XXXx")
        startActivity(intent)
    }
}