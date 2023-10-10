package com.framework.views

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.data.network.model.Movie
import com.data.network.model.MovieObject
import com.example.examen.databinding.ActivityMainBinding
import com.framework.adapters.MoviesAdapter
import com.framework.viewmodel.MainViewModel

class MainActivity: AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    private val adapter : MoviesAdapter = MoviesAdapter()
    private lateinit var data:ArrayList<MovieObject>

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        initializeObservers()
        viewModel.getMovieList()

    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setUpRecyclerView(dataForList:ArrayList<Movie>){
        binding.RVMovies.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVMovies.layoutManager = linearLayoutManager
        adapter.MoviesAdapter(dataForList,this)
        binding.RVMovies.adapter = adapter
    }

    private fun initializeObservers(){
        viewModel.movieLiveData.observe(this){ movieObject ->
            setUpRecyclerView(movieObject.results)
        }
    }
}