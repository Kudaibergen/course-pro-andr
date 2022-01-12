package com.kay.progayim.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Employee(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = null,
    val name: String,
    val company: String,
    val salary: Int
)