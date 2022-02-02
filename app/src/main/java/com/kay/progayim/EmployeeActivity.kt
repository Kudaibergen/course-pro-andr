package com.kay.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kay.progayim.databinding.ActivityEmployeeBinding
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class EmployeeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmployeeBinding
    private val dbInstance get() = Injector.database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmployeeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val e = dbInstance.employeeDao().getById(1L)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSuccess {
                    Log.e("TAG", "employeeActivity doOnSuccess ${Thread.currentThread().name}")
                    txtName.text = it.name
                    txtCompany.text = it.company
                    txtSalary.text = it.salary.toString()
                }
                .doOnError {
                    Log.e("TAG", "employeeActivity doOnError ${Thread.currentThread().name}")
                }
                .subscribe()

        }
    }
}