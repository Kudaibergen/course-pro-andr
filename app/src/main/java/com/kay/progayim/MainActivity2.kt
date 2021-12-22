package com.kay.progayim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.kay.progayim.databinding.ActivityMain2Binding

/* https://developer.android.com/training/basics/intents/result */
class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var launcher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        registerLauncher()

        binding.btn.setOnClickListener {
            launcher.launch(Intent(this, MainActivity3::class.java))
        }
    }

    private fun registerLauncher() {
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == RESULT_OK) {
                binding.txt.text = it.data?.getStringExtra("KEY") ?: "default"
            }
        }
    }
}