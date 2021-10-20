package com.incetro.mylibrary.di

import android.content.Context
import com.incetro.mylibrary.data.database.DbModule
import com.incetro.mylibrary.data.io.IoModule
import com.incetro.mylibrary.data.repository.RepositoryModule
import com.incetro.mylibrary.myinteractor.MyInteractorImpl
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        MainModule::class,
        DbModule::class,
        IoModule::class,
        RepositoryModule::class
    ]
)
@Singleton
interface MainComponent {
    fun inject(app: MyInteractorImpl)
    fun getContext(): Context

    @Component.Builder
    interface Builder {
        fun mainModule(mainModule: MainModule): Builder
        fun build(): MainComponent
    }
}