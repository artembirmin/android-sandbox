package com.incentro.mylibrary.data.io

import android.content.Context
import com.incentro.mylibrary.repository.MeasureRepository
import com.incentro.mylibrary.repository.MeasureRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class IoModule {

    @Provides
    @Singleton
    internal fun provideMeasureRepository(context: Context): MeasureRepository {
        return MeasureRepositoryImpl(context.assets)
    }
}