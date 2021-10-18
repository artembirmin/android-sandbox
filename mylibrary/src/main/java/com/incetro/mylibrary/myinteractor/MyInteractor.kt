package com.incetro.mylibrary.myinteractor

import com.incetro.mylibrary.model.Measure


interface MyInteractor {
    fun getAllFromJson(): List<List<Measure>>
    fun getAllFromDb(): List<Measure>
}
