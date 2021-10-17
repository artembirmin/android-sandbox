package com.incentro.mylibrary.di

import android.content.Context
import com.incentro.mylibrary.data.database.DbModule
import com.incentro.mylibrary.data.io.IoModule
import com.incentro.mylibrary.myinteractor.MyInteractorImpl
import dagger.Component
import javax.inject.Singleton

@Component(modules = [MainModule::class, DbModule::class, IoModule::class])
@Singleton
interface MainComponent {
    fun inject(app: MyInteractorImpl)
    //val context: Context?

    @Component.Builder
    interface Builder {
//        fun mainModule(mainModule: MainModule): Builder
        fun build(): MainComponent
    }
}