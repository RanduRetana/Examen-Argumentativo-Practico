package com.domain

import com.data.MovieRepository

class MovieInfoRequirement {
    private val repository = MovieRepository()

    suspend operator fun invoke(
    ): com.data.network.model.MovieObject? = repository.getMoviesList()
}