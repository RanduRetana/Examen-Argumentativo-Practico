package com.data

import com.data.network.MovieApiClient
import com.data.network.model.Movie
import com.data.network.model.MovieObject

class MovieRepository() {
    private val apiMovie = MovieApiClient()

    suspend fun getMoviesList(limit: Int): MovieObject? {
        return apiMovie.getMoviesList(limit)
    }
}