package com.incetro.mylibrary.repository

import com.incetro.mylibrary.model.Measure

interface MeasureRepository {
    fun getAllFromJson(): List<List<Measure>>
}
