package com.incentro.mylibrary.data.database

import android.content.Context
import androidx.room.Room
import com.incentro.mylibrary.model.Measure
import dagger.Module
import dagger.Provides
import dagger.Reusable
import javax.inject.Singleton

@Module
class DbModule {

//    @Provides
//    @Singleton
//    internal fun provideRoomDatabase(context: Context): AppDatabase {
//        return Room
//            .databaseBuilder(
//                context,
//                AppDatabase::class.java,
//                AppDatabase.DB_NAME
//            )
//            .allowMainThreadQueries()
//            .fallbackToDestructiveMigration()
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    internal fun provideMeasureDao(database: AppDatabase): MeasureDao = database.measureDao()
}