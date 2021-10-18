package com.incetro.mylibrary.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.incetro.mylibrary.model.Measure

@Database(
    entities = [
        Measure::class
    ],
    version = AppDatabase.VERSION
)

@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "mydatabase"
        const val VERSION = 1
    }

    abstract fun measureDao(): MeasureDao


}