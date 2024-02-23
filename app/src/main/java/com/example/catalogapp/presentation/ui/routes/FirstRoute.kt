package com.example.catalogapp.presentation.ui.routes

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.catalogapp.presentation.theme.CatalogAppTheme
import com.example.catalogapp.presentation.ui.components.ProductListItem2
import com.example.catalogapp.presentation.ui.viewmodel.CatalogViewModel

@Composable
fun FirstRoute(catalogViewModel: CatalogViewModel = viewModel()) {
    val products = remember { catalogViewModel.getRandomProducts() }

    LazyColumn(state = rememberLazyListState()) {
        items(
            items = products,
            key = { it.id }
        ) { product ->
            ProductListItem2(product = product)
            Divider(modifier = Modifier.width(80.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun FirstRoutePreview() {
    CatalogAppTheme {
        FirstRoute()
    }
}
