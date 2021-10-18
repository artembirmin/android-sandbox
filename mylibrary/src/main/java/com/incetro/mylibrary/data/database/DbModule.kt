package com.incetro.mylibrary.data.database

import dagger.Module

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