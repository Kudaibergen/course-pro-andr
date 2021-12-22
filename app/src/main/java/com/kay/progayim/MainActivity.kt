package com.kay.progayim

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.kay.progayim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var launcher: ActivityResultLauncher<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initPermissionListener()
        checkCameraPermission()

        binding.btn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    @SuppressLint("NewApi")
    private fun checkCameraPermission() {
        when {
            checkPermission() -> {
                Toast.makeText(this, "Camera run", Toast.LENGTH_SHORT).show()
            }
            shouldShowRequestPermissionRationale(PERMISSION_CAMERA) -> {
                Toast.makeText(this, "We really need your permission!", Toast.LENGTH_SHORT).show()
            }
            else -> {
                launcher.launch(PERMISSION_CAMERA)
            }
        }
    }

    private fun initPermissionListener() {
        launcher = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            if (it) {
                Toast.makeText(this, "Camera run", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun checkPermission(): Boolean {
        return ContextCompat
            .checkSelfPermission(this, PERMISSION_CAMERA) == PackageManager.PERMISSION_GRANTED
    }

    companion object {
        private const val PERMISSION_CAMERA = Manifest.permission.CAMERA
    }
}