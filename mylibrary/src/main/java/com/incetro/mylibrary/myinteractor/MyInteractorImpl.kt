package com.incetro.mylibrary.myinteractor

import android.content.Context
import android.util.Log
import com.incetro.mylibrary.R
import com.incetro.mylibrary.di.DaggerMainComponent
import com.incetro.mylibrary.model.Measure
import com.incetro.mylibrary.repository.MeasureRepository
import javax.inject.Inject

class MyInteractorImpl(context: Context) : MyInteractor {

    @Inject
    lateinit var measureRepository: MeasureRepository

    init {
        DaggerMainComponent.builder()
            .build()
            .inject(this)
        val MEASURES_FILE_NAME = "measure_descriptions.json"

        // Log.i("MYJSON", context.resources.openRawResource(R.raw.measure_descriptions.json) )
        Log.i(
            "MYJSONFROMLIB",
            context.resources.openRawResource(com.incetro.mylibrary.R.raw.measure_descriptions).bufferedReader()
                .use { it.readText() })

    }

    override fun getAllFromJson(): List<List<Measure>> {

        return measureRepository.getAllFromJson()
    }

    override fun getAllFromDb(): List<Measure> {
        TODO("Not yet implemented")
    }
}