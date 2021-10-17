package com.incentro.mylibrary.di

import android.app.Application
import android.content.Context
import com.incentro.mylibrary.repository.MeasureRepository
import com.incentro.mylibrary.repository.MeasureRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainModule(private val application: Application) {

    @Provides
    @Singleton
    internal fun provideContext(): Context {
        return application
    }
}