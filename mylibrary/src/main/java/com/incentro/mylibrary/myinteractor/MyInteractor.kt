package com.incentro.mylibrary.myinteractor

import com.incentro.mylibrary.model.Measure


interface MyInteractor {
    fun getJSON(): List<List<Measure>>
    fun getAllFromDb(): List<Measure>
}
