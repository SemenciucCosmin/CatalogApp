package com.example.catalogapp.presentation.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.catalogapp.navigation.BottomNavigationBar
import com.example.catalogapp.navigation.LocalNavController
import com.example.catalogapp.navigation.LocalSnackbarHostState
import com.example.catalogapp.navigation.NavigationDestination
import com.example.catalogapp.navigation.NavigationGraph
import com.example.catalogapp.presentation.ui.components.CatalogTopAppBar

@Composable
fun CatalogApp() {
    val snackbarHostState = remember { SnackbarHostState() }
    val navController = rememberNavController()
    var currentRoute by remember { mutableStateOf(NavigationDestination.First.route) }
    navController.addOnDestinationChangedListener { _, destination, _ ->
        destination.route?.let { currentRoute = it }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { CatalogTopAppBar(title = currentRoute) },
        bottomBar = { BottomNavigationBar(navController = navController) },
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) }
    ) { paddingValues ->
        CompositionLocalProvider(
            LocalNavController provides navController,
            LocalSnackbarHostState provides snackbarHostState
        ) {
            NavigationGraph(
                modifier = Modifier.padding(paddingValues),
                navController = navController
            )
        }
    }
}
