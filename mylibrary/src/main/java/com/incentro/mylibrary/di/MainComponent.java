package com.incentro.mylibrary.di;

import android.content.Context;
import android.content.res.AssetManager;

import com.incentro.mylibrary.data.database.DbModule;
import com.incentro.mylibrary.myinteractor.MyInteractorImpl;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {MainModule.class, DbModule.class})
@Singleton
public interface MainComponent {

    void inject(MyInteractorImpl app);

    Context getContext();
}