package com.kay.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("TAG", "Berg: onCreate")

        val txt = findViewById<TextView>(R.id.txt_hello)
        val btn = findViewById<Button>(R.id.btn)

        var count = 0
        btn.setOnClickListener {
            ++count
            //count = count + 1

            //count++
            //count + 1
            //count = <- (count + 1)
            txt.text = count.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("key", "value")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val value = savedInstanceState.getString("key")
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG", "Berg: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG", "Berg: onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("TAG", "Berg: onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Berg","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("TAG", "Berg: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG", "Berg: onDestroy")
        // ---
    }
}