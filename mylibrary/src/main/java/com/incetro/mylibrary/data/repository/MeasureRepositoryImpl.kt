package com.incetro.mylibrary.data.repository

import android.content.res.Resources
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.incetro.mylibrary.R
import com.incetro.mylibrary.data.database.MeasureDao
import com.incetro.mylibrary.model.Measure
import com.incetro.mylibrary.model.MeasureLists
import kotlinx.coroutines.runBlocking
import java.io.IOException

class MeasureRepositoryImpl(
    private val resources: Resources,
    private val measureDao: MeasureDao
) :
    MeasureRepository {

    override fun getAllFromJson(): List<Measure> {
        val listOfListsOfMeasures = object : TypeToken<MeasureLists>() {}.type
        return (GsonBuilder().create()
            .fromJson(loadMeasuresJson(), listOfListsOfMeasures) as MeasureLists)
            .let { listOf(it.length, it.area) }.flatten()
    }

    override suspend fun getAllFromDb(): List<Measure> {
        return measureDao.getAll()
    }

    override fun initDatabase() {
        runBlocking {
            measureDao.insertAll(getAllFromJson())
        }
    }

    @Throws(IOException::class)
    private fun loadMeasuresJson(): String {
        return resources.openRawResource(R.raw.measure_descriptions).bufferedReader()
            .use { it.readText() }
    }
}