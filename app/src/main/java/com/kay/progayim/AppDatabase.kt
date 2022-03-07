package com.kay.progayim

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@TypeConverters(TypeListConverter::class)
@Database(entities = [CharacterEntity::class], version = 2)
abstract class AppDatabase: RoomDatabase()  {

    abstract fun characterDao(): CharacterDao

}