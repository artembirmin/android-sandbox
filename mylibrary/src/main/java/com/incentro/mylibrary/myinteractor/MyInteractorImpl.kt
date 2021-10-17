package com.incentro.mylibrary.myinteractor

import android.app.Application
import com.incentro.mylibrary.data.database.DbModule
import com.incentro.mylibrary.di.MainModule
import com.incentro.mylibrary.model.Measure
import com.incentro.mylibrary.repository.MeasureRepository
import javax.inject.Inject

class MyInteractorImpl : MyInteractor {

    @Inject
    lateinit var measureRepository: MeasureRepository

    init {
        DaggerMainComponent().builder()
           // .mainModule(MainModule())
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