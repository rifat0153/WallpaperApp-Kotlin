package com.example.wallpaperapp.data.remote

import com.example.wallpaperapp.BuildConfig
import com.example.wallpaperapp.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getAllImages(
        @Query(value = "page") page: Int,
        @Query("per_page") perPage: Int
    ) : List<UnsplashImage>

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query(value = "page") page: Int,
        @Query("per_page") perPage: Int
    ) : List<UnsplashImage>




}