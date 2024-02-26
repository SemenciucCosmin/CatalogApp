package com.example.catalogapp.presentation.ui.routes

import android.content.res.Configuration
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.catalogapp.presentation.theme.CatalogAppTheme
import com.example.catalogapp.presentation.ui.components.CategoryListItem
import com.example.catalogapp.presentation.ui.viewmodel.CatalogViewModel

@Composable
fun FirstRoute(catalogViewModel: CatalogViewModel = viewModel()) {
    val uiState by catalogViewModel.uiState.collectAsStateWithLifecycle()

    LazyColumn(state = rememberLazyListState()) {
        items(
            items = uiState.categories,
            key = { it.id }
        ) { categories ->
            CategoryListItem(category = categories)
        }
    }
}

@Preview(showSystemUi = true)
@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun FirstRoutePreview() {
    CatalogAppTheme {
        FirstRoute()
    }
}
