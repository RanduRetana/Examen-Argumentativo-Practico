package com.domain

import com.data.MovieRepository
import com.data.network.model.Movie
import com.data.network.model.MovieObject

class MovieListRequirement {
    private val repository = MovieRepository()

    suspend operator fun invoke(limit: Int): MovieObject? {
        return repository.getMoviesList(limit)
    }
}