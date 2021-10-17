package com.incentro.mylibrary.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.incentro.mylibrary.BuildConfig
import com.incentro.mylibrary.data.database.AppDatabase.Companion.DB_NAME
import com.incentro.mylibrary.model.Measure

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