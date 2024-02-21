package com.example.catalogapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.catalogapp.presentation.ui.routes.FirstRoute
import com.example.catalogapp.presentation.ui.routes.FourthRoute
import com.example.catalogapp.presentation.ui.routes.SecondRoute
import com.example.catalogapp.presentation.ui.routes.ThirdRoute

@Composable
fun NavigationGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = NavigationDestination.First.route,
        modifier = modifier
    ) {
        composable(NavigationDestination.First.route) { FirstRoute() }
        composable(NavigationDestination.Second.route) { SecondRoute() }
        composable(NavigationDestination.Third.route) { ThirdRoute() }
        composable(NavigationDestination.Fourth.route) { FourthRoute() }
    }
}
