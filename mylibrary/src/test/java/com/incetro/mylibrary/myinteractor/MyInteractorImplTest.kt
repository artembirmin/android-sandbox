package com.incetro.mylibrary.myinteractor

import junit.framework.TestCase
import org.junit.Test

class MyInteractorImplTest : TestCase() {

    lateinit var interactor: MyInteractor

    override fun setUp() {
        interactor = MyInteractorImpl()
    }

    @Test
    fun testGetAllFromJson() {
        interactor.getAllFromJson()

    }

    @Test
    fun testGetAllFromDb() {
    }
}