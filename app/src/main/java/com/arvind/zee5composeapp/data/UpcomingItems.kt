package com.arvind.zee5composeapp.data

data class UpcomingItems(
    val id: Int,
    val upcomingImageId: Int = 0,
    val releaseDateTitle: String,
    val trailerTitle: String,
    val trailerDescription: String,
    val trailerCategory: String,

)
