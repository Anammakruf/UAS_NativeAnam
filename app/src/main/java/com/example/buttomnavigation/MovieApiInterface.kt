package com.example.buttomnavigation

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=786b303ced960c97bb6aed92a86dd8c6")
    fun getMovieList(): Call<MovieResponse>
}

