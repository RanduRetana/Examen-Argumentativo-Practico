package com.framework.adapters.viewholders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.data.network.model.Movie
import com.example.examen.databinding.ItemMovieBinding

class MoviesViewHolder(private val binding: ItemMovieBinding): RecyclerView.ViewHolder(binding.root){

    fun bind(item: Movie, context: Context){
        binding.TVTitle.text = item.original_title
        binding.TVDescription.text = item.overview
        //setImage(item.poster_path, context)
}

    /*private fun setImage(poster_path: String, context: Context) {
        val url = "https://image.tmdb.org/t/p/w500$poster_path"
        //Picasso.get().load(url).into(binding.IVPoster)
    }*/
}