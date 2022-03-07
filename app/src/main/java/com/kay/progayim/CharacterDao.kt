package com.kay.progayim

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface CharacterDao {

    @Query("SELECT * FROM CharacterEntity")
    fun getAll(): List<CharacterEntity>

    @Query("SELECT * FROM CharacterEntity WHERE id = :id")
    fun getById(id: Long?): CharacterEntity

    @Insert
    fun insert(character: CharacterEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertList(characters: List<CharacterEntity>)

    @Update
    fun update(character: CharacterEntity)

    @Delete
    fun delete(character: CharacterEntity)
}