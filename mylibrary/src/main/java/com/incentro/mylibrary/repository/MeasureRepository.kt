package com.incentro.mylibrary.repository

import com.incentro.mylibrary.model.Measure

interface MeasureRepository {
    fun getAllFromJson(): List<List<Measure>>

}
