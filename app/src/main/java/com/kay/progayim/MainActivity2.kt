package com.kay.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.e(TAG, "Berg: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "Berg: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "Berg: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"Berg: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "Berg: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "Berg: onDestroy")
    }

    companion object {
        private const val TAG = "MainActivity_2"
    }
}