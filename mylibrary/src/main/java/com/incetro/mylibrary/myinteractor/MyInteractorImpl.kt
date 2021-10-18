package com.incetro.mylibrary.myinteractor

import android.content.res.Resources
import com.incetro.mylibrary.di.DaggerMainComponent
import com.incetro.mylibrary.model.Measure
import com.incetro.mylibrary.repository.MeasureRepository
import javax.inject.Inject

class MyInteractorImpl : MyInteractor {

    @Inject
    lateinit var measureRepository: MeasureRepository

    init {
        DaggerMainComponent.builder()
            .build()
            .inject(this)
    }

    override fun getAllFromJson(): List<List<Measure>> {

        return measureRepository.getAllFromJson()
    }

    override fun getAllFromDb(): List<Measure> {
        TODO("Not yet implemented")
    }
}