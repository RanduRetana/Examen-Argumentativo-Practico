package com.data.network.model

import com.google.gson.annotations.SerializedName

data class MovieObject(
    @SerializedName("total") val total: Int,
    @SerializedName("results") val results: ArrayList<Movie>,
)