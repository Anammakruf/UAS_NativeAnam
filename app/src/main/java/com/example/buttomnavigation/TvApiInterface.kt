package com.example.buttomnavigation

import retrofit2.Call
import retrofit2.http.GET

interface TvApiInterface {

    @GET("/3/tv/popular?api_key=7cca60f4431fbdd5a7dea9b5b8176434")
    fun getTvList(): Call<TvResponse>
}