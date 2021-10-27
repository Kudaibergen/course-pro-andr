package com.kay.progayim

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import net.objecthunter.exp4j.ExpressionBuilder
import kotlin.math.exp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "Berg: onCreate")

        val txt = findViewById<TextView>(R.id.txt_hello)
        val btn = findViewById<AppCompatButton>(R.id.btnGoTo2)
        btn.setOnClickListener {
            val expr = "2/0"
            val exprs = ExpressionBuilder(expr).build()
            val res = exprs.evaluate()
            txt.text = res.toString()
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
        }
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
        Log.e(TAG,"onPause")
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
        private const val TAG = "MainActivity_1"
    }
}