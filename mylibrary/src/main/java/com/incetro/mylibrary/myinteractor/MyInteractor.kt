package com.incetro.mylibrary.myinteractor

import com.incetro.mylibrary.model.Measure


interface MyInteractor {
    fun getAllFromJson(): List<Measure>
    fun getAllFromDb(): List<Measure>
    fun initDatabase()
}
