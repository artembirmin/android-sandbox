package com.incetro.mylibrary.di

import com.incetro.mylibrary.data.database.DbModule
import com.incetro.mylibrary.data.io.IoModule
import com.incetro.mylibrary.myinteractor.MyInteractorImpl
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        MainModule::class,
        DbModule::class,
        IoModule::class
    ]
)
@Singleton
interface MainComponent {
    fun inject(app: MyInteractorImpl)

    @Component.Builder
    interface Builder {
        fun build(): MainComponent
    }
}