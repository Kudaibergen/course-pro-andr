package com.kay.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    private lateinit var txtView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtView = findViewById(R.id.txtView)

        val x = "asdasd"
//        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
//        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
//        val btn3 = findViewById<AppCompatButton>(R.id.btn3)
//
//        btn1.setOnClickListener {
//            txtView.text = "click 1"
//            Toast.makeText(this, "Click 1", Toast.LENGTH_SHORT).show()
//        }
//
//        btn2.setOnClickListener {
//            txtView.text = "click 2"
//            Toast.makeText(this, "Click 2", Toast.LENGTH_LONG).show()
//        }
//
//        btn3.setOnClickListener {
//            txtView.text = "click 3"
//            Toast.makeText(this, "Click 3", Toast.LENGTH_SHORT).show()
//        }

//        btn1.setOnClickListener(this)
//        btn2.setOnClickListener(this)
//        btn3.setOnClickListener(this)
    }

//    override fun onClick(view: View) {
//        val msg = when (view.id) {
//            R.id.btn1 -> "Click 1"
//            R.id.btn2 -> "Click 2"
//            R.id.btn3 -> "Click 3"
//            else -> "Unknown"
//        }
//        txtView.text = msg
//    }

//    fun onClickEvent(view: View) {
//        val msg = when(view.id) {
//            R.id.btn1 -> "Click 1"
//            R.id.btn2 -> "Click 2"
//            R.id.btn3 -> "Click 3"
//            else -> "Unknown"
//        }
//        val txtView = findViewById<TextView>(R.id.txtView)
//        txtView.text = msg
//    }
}