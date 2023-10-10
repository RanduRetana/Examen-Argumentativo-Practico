package com.data

import com.data.network.MovieApiClient

class MovieRepository() {
    private val apiMovie = MovieApiClient()

    suspend fun getMoviesList(): com.data.network.model.MovieObject? = apiMovie.getMoviesList()
}