package com.framework.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.data.network.model.movie.Movie
import com.example.examen.databinding.ItemMovieBinding
import com.framework.adapters.viewholders.MoviesViewHolder

class MoviesAdapter: RecyclerView.Adapter<MoviesViewHolder>(){
    var data:ArrayList<Movie> = ArrayList()
    private lateinit var context: Context

    fun MoviesAdapter(basicData : ArrayList<Movie>, context:Context){
        this.data = basicData
        this.context = context
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item,context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MoviesViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}