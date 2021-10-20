package com.incetro.mylibrary.data.io

import android.content.Context
import android.content.res.Resources
import com.incetro.mylibrary.data.repository.MeasureRepository
import com.incetro.mylibrary.data.repository.MeasureRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class IoModule {

    @Provides
    @Singleton
    internal fun provideResources(context: Context): Resources {
        return context.resources
    }
}