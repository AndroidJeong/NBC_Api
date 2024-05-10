package com.example.nbcsearchsave.api

import retrofit2.http.GET
import retrofit2.http.Query

interface KakaoInterface {
    @GET("v2/search/image")
    suspend fun getImage(
        @Query("query") searchWord: String,
        @Query("page") page: Int = 1,
        @Query("size") size: Int = 80
    )

}