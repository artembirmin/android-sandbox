package com.incetro.mylibrary.repository

import android.content.res.Resources
import com.google.gson.GsonBuilder
import com.incetro.mylibrary.model.Measure
import java.io.IOException
import java.io.InputStream
import java.nio.charset.StandardCharsets

class MeasureRepositoryImpl : MeasureRepository {

    init {
        GsonBuilder().create()
            .fromJson<List<List<Measure>>>(loadMeasuresJson(), ::Measure.javaClass)
    }

    override fun getAllFromJson(): List<List<Measure>> {
        return GsonBuilder().create()
            .fromJson<List<List<Measure>>>(loadMeasuresJson(), ::Measure.javaClass)
    }

    @Throws(IOException::class)
    private fun loadMeasuresJson(): String? {
        val inputStream: InputStream = Resources.getSystem().assets.open(MEASURES_FILE_NAME)
        return String(inputStream.readBytes(), StandardCharsets.UTF_8)
    }

    companion object {
        private const val MEASURES_FILE_NAME = "MeasureDescription.json"
    }
}