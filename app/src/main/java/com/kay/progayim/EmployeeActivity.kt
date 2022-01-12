package com.kay.progayim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kay.progayim.databinding.ActivityEmployeeBinding

class EmployeeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmployeeBinding
    private val dbInstance get() = Injector.database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmployeeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val e = dbInstance.employeeDao().getById(1L)
            txtName.text = e.name
            txtCompany.text = e.company
            txtSalary.text = e.salary.toString()
        }
    }
}