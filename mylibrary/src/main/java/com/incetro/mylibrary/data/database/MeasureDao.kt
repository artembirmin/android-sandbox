package com.incetro.mylibrary.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.incetro.mylibrary.model.Measure

@Dao
interface MeasureDao {

    @Query("SELECT * FROM measure")
    suspend fun getAll(): List<Measure>

    @Insert
    suspend fun insert(employee: Measure)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(users: List<Measure>)
}