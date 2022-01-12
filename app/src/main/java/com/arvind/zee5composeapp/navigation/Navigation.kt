package com.arvind.zee5composeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arvind.zee5composeapp.view.BottomBarZee5
import com.arvind.zee5composeapp.view.HomeTabBar
import com.arvind.zee5composeapp.view.SplashScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.route
    ) {
        composable(Screens.SplashScreen.route) {
            SplashScreen(navController = navController)
        }

        composable(Screens.HomeScreen.route) {
            BottomBarZee5(navController)
        }

    }
}