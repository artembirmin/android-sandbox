package com.incetro.mylibrary.data.database

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object Converters {
    private val gson = Gson()

    @TypeConverter
    @JvmStatic
    fun fromStringToArrayList(value: String): List<String> {
        val listType = object : TypeToken<ArrayList<String>>() {}.type
        return gson.fromJson(value, listType)
    }

    @TypeConverter
    @JvmStatic
    fun fromArrayListToString(list: List<String>): String {
        return gson.toJson(list)
    }
}
