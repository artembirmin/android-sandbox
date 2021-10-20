package com.incetro.mylibrary.data.repository

import com.incetro.mylibrary.model.Measure

interface MeasureRepository {
    fun getAllFromJson(): List<Measure>
    suspend fun getAllFromDb() : List<Measure>
    fun initDatabase()
}
