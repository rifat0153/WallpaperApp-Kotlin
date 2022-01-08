package com.example.wallpaperapp.di

import android.content.Context
import androidx.room.Room
import com.example.wallpaperapp.data.local.UnsplashDatabase
import com.example.wallpaperapp.model.util.Constants
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    fun provideDatabase(
        @ApplicationContext context: Context
    ): UnsplashDatabase {
        return Room.databaseBuilder(
            context,
            UnsplashDatabase::class.java,
            Constants.UNSPLASH_DATABASE
        ).build()
    }
}