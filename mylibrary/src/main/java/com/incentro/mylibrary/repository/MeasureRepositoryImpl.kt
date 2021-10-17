package com.incentro.mylibrary.repository

import android.content.Context
import android.content.res.AssetManager
import com.google.gson.GsonBuilder
import com.incentro.mylibrary.model.Measure
import java.io.IOException
import java.io.InputStream
import java.nio.charset.StandardCharsets
import javax.inject.Inject

class MeasureRepositoryImpl @Inject constructor(
    private val assetManager: AssetManager
) : MeasureRepository {

    fun initDB() {
        GsonBuilder().create().fromJson<List<List<Measure>>>(loadMeasuresJson(), ::Measure.javaClass)
    }

    @Throws(IOException::class)
    private fun loadMeasuresJson(): String? {
        val inputStream: InputStream = assetManager.open(MEASURES_FILE_NAME)
        return String(inputStream.readBytes(), StandardCharsets.UTF_8)
    }

    companion object {
        private const val MEASURES_FILE_NAME = "MeasureDescription.json"
    }
}