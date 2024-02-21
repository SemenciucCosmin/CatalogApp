package com.example.catalogapp.presentation.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.catalogapp.navigation.BottomNavigationBar
import com.example.catalogapp.navigation.LocalNavController
import com.example.catalogapp.navigation.NavigationGraph

@Composable
fun CatalogApp() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) { paddingValues ->
        CompositionLocalProvider(LocalNavController provides navController) {
            NavigationGraph(
                modifier = Modifier.padding(paddingValues),
                navController = navController
            )
        }
    }
}
