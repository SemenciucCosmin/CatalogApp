package com.example.catalogapp.navigation

sealed class NavigationDestination(val route: String) {
    data object First : NavigationDestination("first_route")
    data object Second : NavigationDestination("second_route")
    data object Third : NavigationDestination("third_route")
    data object Fourth : NavigationDestination("fourth_route")
}
