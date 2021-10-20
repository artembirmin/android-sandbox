package com.incetro.mylibrary.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainModule(
    private val context: Context
) {
    @Provides
    @Singleton
    internal fun provideContext(): Context {
        return context
    }
}