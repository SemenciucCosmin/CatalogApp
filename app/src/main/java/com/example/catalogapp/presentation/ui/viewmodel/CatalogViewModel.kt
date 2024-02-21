package com.example.catalogapp.presentation.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.catalogapp.model.Product
import com.example.catalogapp.model.ProductType
import java.util.UUID
import kotlin.random.Random

class CatalogViewModel : ViewModel() {
    fun getRandomProducts(): List<Product> {
        val products = mutableListOf<Product>()

        for (index in 0..9) {
            products.add(
                Product(
                    id = UUID.randomUUID().toString(),
                    iconUrl = "https://picsum.photos/200",
                    name = getRandomString(),
                    rating = Random.nextInt(0, 50).toFloat() / 10,
                    type = ProductType.TYPE_3,
                    expiringDate = getRandomDate(),
                    isNew = Random.nextBoolean()
                )
            )
        }

        return products
    }

    private fun getRandomString(): String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..20)
            .map { allowedChars.random() }
            .joinToString("")
    }

    private fun getRandomDate(): String {
        val randomDay = Random.nextInt(1, 31)
        val randomMonth = Random.nextInt(1, 12)
        val randomYear = Random.nextInt(2024, 2030)
        return "$randomDay/$randomMonth/$randomYear"
    }
}
