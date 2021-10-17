package com.incentro.mylibrary.myinteractor

import com.incentro.mylibrary.model.Measure
import com.incentro.mylibrary.repository.MeasureRepository
import com.incentro.mylibrary.repository.MeasureRepositoryImpl
import javax.inject.Inject

class MyInteractorImpl @Inject constructor(
    measureRepository: MeasureRepository
) : MyInteractor {
    override fun getJSON(): List<List<Measure>> {
        TODO("Not yet implemented")
    }

    override fun getAllFromDb(): List<Measure> {
        TODO("Not yet implemented")
    }
}