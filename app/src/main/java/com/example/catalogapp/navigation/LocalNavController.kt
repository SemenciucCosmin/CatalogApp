package com.example.catalogapp.navigation

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController

val LocalNavController = staticCompositionLocalOf<NavHostController> {
    throw IllegalStateException("No NavController provided")
}

val LocalSnackbarHostState = staticCompositionLocalOf<SnackbarHostState> {
    throw IllegalStateException("No NavController provided")
}
