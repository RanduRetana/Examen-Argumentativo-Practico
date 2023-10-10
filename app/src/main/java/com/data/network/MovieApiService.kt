package com.data.network

import com.data.network.model.Movie
import com.data.network.model.MovieObject
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    //https://api.themoviedb.org/3/
    @GET("movie/popular")
    suspend fun getMoviesList(
        @Query("page") page: Int
    ): MovieObject
}