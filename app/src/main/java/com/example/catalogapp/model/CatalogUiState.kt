package com.example.catalogapp.model

data class CatalogUiState(
    val categories: List<Category>,
    val products: List<Product>,
    val tabs: List<Tab>,
)
