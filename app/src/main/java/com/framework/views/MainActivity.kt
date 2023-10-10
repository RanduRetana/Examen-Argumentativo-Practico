package com.framework.views

import androidx.appcompat.app.AppCompatActivity
import com.example.examen.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    private val adapter : MoviesAdapter = MoviesAdapter()
    private lateinit var data:ArrayList<MoviesBase>

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        initializeObservers()
        viewModel.getMoviesList()

    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setUpRecyclerView(dataForList:ArrayList<MoviesBase>){
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
        viewModel.moviesObjectLiveData.observe(this){ moviesObject ->
            setUpRecyclerView(moviesObject.results)
        }
    }
}