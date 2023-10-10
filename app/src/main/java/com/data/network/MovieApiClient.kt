package com.data.network

class MovieApiClient {
    private lateinit var api: MovieApiService

    suspend fun getMoviesList(): com.data.network.model.MovieObject?{
        api = NetworkModuleDI()
        return try{
            api.getMoviesList()
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}