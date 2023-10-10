package com.data.network

import retrofit2.http.GET

interface MovieApiService {
    //https://api.themoviedb.org/3/
    @GET("movie/popular")
    suspend fun getMoviesList(
    ):com.data.network.model.movie.Movie
}