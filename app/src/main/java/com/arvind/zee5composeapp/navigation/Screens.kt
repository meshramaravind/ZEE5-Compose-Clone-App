package com.arvind.zee5composeapp.navigation

import android.annotation.SuppressLint

sealed class Screens(val route: String) {
    @SuppressLint("CustomSplashScreen")
    object SplashScreen : Screens("splash_screen")
    object HomeScreen : Screens("home_screen")
    object SearchScreen : Screens("search_screen")
    object CategoryScreen : Screens("category_screen")
    object CartScreen : Screens("cart_screen")
    object ProfileScreen : Screens("profile_screen")
}
