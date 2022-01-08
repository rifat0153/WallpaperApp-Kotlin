package com.example.wallpaperapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.wallpaperapp.data.local.dao.UnsplashImageDao
import com.example.wallpaperapp.data.local.dao.UnsplashRemoteKeysDao
import com.example.wallpaperapp.model.UnsplashImage
import com.example.wallpaperapp.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}