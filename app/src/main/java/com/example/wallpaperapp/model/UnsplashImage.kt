package com.example.wallpaperapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.wallpaperapp.model.util.Constants
import kotlinx.serialization.Serializable

@Entity(tableName = Constants.UNSPLASH_IMAGE_TABLE)
@Serializable
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val  id : String,
    val urls : Urls,
    val likes: Int,
    val user: User,
)
