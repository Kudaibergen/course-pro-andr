package com.kay.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_3)

        val txt = findViewById<AppCompatTextView>(R.id.txt_act_3)

        when(intent.action) {
            ACTION_1 -> {
                val extra = intent.getStringExtra("key")
                txt.text = "This activity 3, action1 $extra"
            }
            "action2" -> {
                val extra = intent.getStringExtra("key")
                txt.text = "This activity 3, action2 $extra"

                //-> to
                //-> subject
                //-> letter
            }
            else -> {
                txt.text = "This activity 3, no action"
            }
        }
    }

    companion object {
        const val ACTION_1 = "com.kay.progayim.action1"
    }
}