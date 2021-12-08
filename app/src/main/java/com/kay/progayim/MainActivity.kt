package com.kay.progayim

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kay.progayim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            getPreferences(MODE_PRIVATE)
            val prefs = getSharedPreferences("MyAppPrefs", MODE_PRIVATE)

            txt.text = prefs.getString(KEY_TEXT, "defValue")
            txt.text = prefs.getString(KEY_TEXT_2, "defValue")

            btn.setOnClickListener {
                val editor = prefs.edit()
                editor.putString(KEY_TEXT, edit.text.toString())
                editor.apply()
            }

            btn.setOnClickListener {
                val editor = prefs.edit()
                editor.putString(KEY_TEXT_2, edit.text.toString())
                editor.apply()
            }
        }
    }

    companion object {
        private const val KEY_TEXT = "keyText"
        private const val KEY_TEXT_2 = "keyText2"
    }
}