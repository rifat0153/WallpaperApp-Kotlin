package com.example.wallpaperapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.wallpaperapp.model.util.Constants

@Entity(tableName = Constants.UNSPLASH_REMOTE_KEYS_TABLE)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?,
)
