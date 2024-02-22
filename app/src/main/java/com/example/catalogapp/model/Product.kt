package com.example.catalogapp.model

data class Product(
    val id: String,
    val iconUrl: String,
    val name: String,
    val rating: Float,
    val type: ProductType,
    val expiringDate: String,
    val price: String,
    val isNew: Boolean,
)
