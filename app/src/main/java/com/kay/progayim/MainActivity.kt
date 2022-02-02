package com.kay.progayim

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kay.progayim.database.Employee
import com.kay.progayim.databinding.ActivityMainBinding
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dbInstance get() = Injector.database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnSave.setOnClickListener {
                val e = Employee(
                    name = txtName.text.toString(),
                    company = txtCompany.text.toString(),
                    salary = txtSalary.text.toString().toInt()
                )

                dbInstance.employeeDao().insert(e)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doOnComplete {
                        Log.e("TAG", "mainActivity doOnComplete ${Thread.currentThread().name}")
                        startActivity(Intent(this@MainActivity, EmployeeActivity::class.java))
                    }
                    .doOnError {
                        Log.e("TAG", "mainActivity doOnError ${Thread.currentThread().name}")
                    }
                    .subscribe()
            }
        }

    }
}