package com.example.catalogapp.navigation

import com.example.catalogapp.R


data class BottomNavigationItem(
    val label: Int,
    val icon: Int,
    val route: String
)

val bottomNavigationItems = listOf(
    BottomNavigationItem(
        label = R.string.lbl_route_first,
        icon = R.drawable.ic_first,
        route = NavigationDestination.First.route
    ),
    BottomNavigationItem(
        label = R.string.lbl_route_second,
        icon = R.drawable.ic_second,
        route = NavigationDestination.Second.route
    ),
    BottomNavigationItem(
        label = R.string.lbl_route_third,
        icon = R.drawable.ic_third,
        route = NavigationDestination.Third.route
    ),
    BottomNavigationItem(
        label = R.string.lbl_route_fourth,
        icon = R.drawable.ic_fourth,
        route = NavigationDestination.Fourth.route
    )
)
