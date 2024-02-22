package com.example.catalogapp.presentation.ui.routes

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.catalogapp.presentation.theme.CatalogAppTheme
import com.example.catalogapp.presentation.ui.viewmodel.CatalogViewModel

@Composable
fun FirstRoute(catalogViewModel: CatalogViewModel = viewModel()) {

}

@Preview(showSystemUi = true)
@Composable
private fun FirstRoutePreview(){
    CatalogAppTheme {
        FirstRoute()
    }
}
