package com.data.network

import android.util.Log
import com.data.network.model.Movie
import com.data.network.model.MovieObject

class MovieApiClient {
    private lateinit var api: MovieApiService

    suspend fun getMoviesList(limit: Int): MovieObject?{
        api = NetworkModuleDI()
        return try{
            val result = api.getMoviesList(limit)
            Log.d("yaporfavorfunciona", result.toString())
            result
        }catch (e:java.lang.Exception){
            Log.d("enesrio???", "mvlv")
            e.printStackTrace()
            null
        }
    }
}