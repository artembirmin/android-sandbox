package com.incetro.mylibrary.data.io

import android.content.Context
import com.incetro.mylibrary.repository.MeasureRepository
import com.incetro.mylibrary.repository.MeasureRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class IoModule {

    @Provides
    @Singleton
    internal fun provideMeasureRepository(): MeasureRepository {
        return MeasureRepositoryImpl()
    }
}