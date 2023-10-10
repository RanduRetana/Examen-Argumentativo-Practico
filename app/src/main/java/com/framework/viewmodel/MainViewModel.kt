package com.framework.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.data.network.model.Movie
import com.data.network.model.MovieObject
import com.domain.MovieListRequirement
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val movieLiveData = MutableLiveData<MovieObject>()
    private val movieListRequirement = MovieListRequirement()

    fun getMovieList(){
        viewModelScope.launch(Dispatchers.IO){
            try {
                Log.d("sillegaaqui", "adsf")
                val result : MovieObject? = movieListRequirement(10)
                if(result != null) {
                    movieLiveData.postValue(result!!)
                }
            }catch (e: Exception){
                Log.d("no te aguites mi rey", "no te aguites mi rey")
            }
        }
    }
}