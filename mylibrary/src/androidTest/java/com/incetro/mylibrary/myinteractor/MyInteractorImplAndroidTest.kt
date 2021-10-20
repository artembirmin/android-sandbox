package com.incetro.mylibrary.myinteractor

import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.TestCase
import org.junit.Test

class MyInteractorImplAndroidTest : TestCase() {

    private val TAG = this.name
    lateinit var interactor: MyInteractor

    override fun setUp() {
        interactor = MyInteractorImpl(InstrumentationRegistry.getInstrumentation().targetContext)
    }

    @Test
    fun testGetAllFromJson() {
        val jsons = interactor.getAllFromJson()
        Log.i(TAG, "testGetAllFromJson: $jsons")
    }

    @Test
    fun testGetAllFromDb() {
        interactor.initDatabase()
        val measires = interactor.getAllFromDb()
        Log.d(TAG, "testGetAllFromJson: ${measires.joinToString(separator = "\n", prefix = "[", postfix = "]")}}")
    }
}