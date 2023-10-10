package com.framework.adapters.viewholders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.data.network.model.MovieBase
import com.data.network.model.movie.Movie
import com.example.examen.databinding.ItemMovieBinding

class MoviesViewHolder(private val binding: ItemMovieBinding): RecyclerView.ViewHolder(binding.root){

    fun bind(item: Movie, context: Context){
        binding.TVTitle.text = item

}