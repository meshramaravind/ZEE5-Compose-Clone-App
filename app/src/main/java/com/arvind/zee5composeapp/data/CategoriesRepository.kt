package com.arvind.zee5composeapp.data

object CategoriesRepository {

    val categoryShowItems = CategoryShow(
        id = 1,
        "Home"
    )

    val categoryList = listOf(
        categoryShowItems,
        categoryShowItems.copy(
            id = 2,
            title = "Tv Shows",
        ),
        categoryShowItems.copy(
            id = 3,
            title = "Movies",
        ),
        categoryShowItems.copy(
            id = 4,
            title = "Premium",
        ),
        categoryShowItems.copy(
            id = 5,
            title = "News",
        ),
        categoryShowItems.copy(
            id = 6,
            title = "Web Series",
        ),
        categoryShowItems.copy(
            id = 7,
            title = "Live TV",
        ),
        categoryShowItems.copy(
            id = 8,
            title = "Music",
        ),
        categoryShowItems.copy(
            id = 9,
            title = "Learning",
        ),

        )
}