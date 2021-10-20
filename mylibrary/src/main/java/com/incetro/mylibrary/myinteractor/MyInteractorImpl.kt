package com.incetro.mylibrary.myinteractor

import android.content.Context
import com.incetro.mylibrary.data.repository.MeasureRepository
import com.incetro.mylibrary.di.DaggerMainComponent
import com.incetro.mylibrary.di.MainModule
import com.incetro.mylibrary.model.Measure
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

class MyInteractorImpl(context: Context) : MyInteractor {

    @Inject
    lateinit var measureRepository: MeasureRepository

    init {
        DaggerMainComponent.builder()
            .mainModule(MainModule(context))
            .build()
            .inject(this)
//        Log.i(
//            "MYJSONFROMLIB",
//            context.resources.openRawResource(R.raw.measure_descriptions).bufferedReader()
//                .use { it.readText() })

    }

    override fun getAllFromJson(): List<Measure> {
        return measureRepository.getAllFromJson()
    }

    override fun getAllFromDb(): List<Measure> {
        return runBlocking { measureRepository.getAllFromDb() }
    }

    override fun initDatabase() {
        measureRepository.initDatabase()
    }
}