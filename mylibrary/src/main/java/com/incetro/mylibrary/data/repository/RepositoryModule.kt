package com.incetro.mylibrary.data.repository

import android.content.Context
import android.content.res.Resources
import com.incetro.mylibrary.data.database.MeasureDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    internal fun provideMeasureRepository(resources: Resources, measureDao: MeasureDao): MeasureRepository {
        return MeasureRepositoryImpl(resources,measureDao)
    }
}