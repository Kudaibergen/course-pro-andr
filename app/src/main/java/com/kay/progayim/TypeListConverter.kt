package com.kay.progayim

import androidx.room.TypeConverter
import com.google.gson.Gson

class TypeListConverter {

    @TypeConverter
    fun listToJson(value: List<String>?) = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String) = Gson().fromJson(value, Array<String>::class.java).toList()
}