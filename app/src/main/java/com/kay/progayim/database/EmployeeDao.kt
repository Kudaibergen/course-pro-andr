package com.kay.progayim.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface EmployeeDao {

    @Query("SELECT * FROM employee")
    fun getAll(): List<Employee>

    @Query("SELECT * FROM employee WHERE id = :id")
    fun getById(id: Long): Employee

    @Insert
    fun insert(employee: Employee)

    @Update
    fun update(employee: Employee)

    @Delete
    fun delete(employee: Employee)
}