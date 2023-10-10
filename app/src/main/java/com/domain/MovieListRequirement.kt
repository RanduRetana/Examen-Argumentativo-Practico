package com.domain

import com.data.MovieRepository

class MovieListRequirement {
    private val repository = MovieRepository()

    suspend operator fun invoke(
        limit:Int
    ): com.data.network.model.MovieObject? = repository.getMoviesList()
}