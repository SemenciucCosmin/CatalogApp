package com.example.catalogapp.presentation.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogapp.model.Product
import com.example.catalogapp.model.ProductType
import com.example.catalogapp.presentation.theme.CatalogAppTheme
import java.util.UUID

@Composable
fun ProductListItem(product: Product) {
    ListItem(
        headlineContent = { Text(text = product.name) },
        supportingContent = {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                if (product.isNew) Label() else Text(text = product.price)
                RatingRow(rating = product.rating)
            }
        },
        leadingContent = {
            ProductIcon(
                iconUrl = product.iconUrl,
                modifier = Modifier.size(56.dp)
            )
        }
    )
}


@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ProductListItemPreview() {
    CatalogAppTheme {
        ProductListItem(
            Product(
                id = UUID.randomUUID().toString(),
                iconUrl = "https://picsum.photos/200",
                name = "Bread",
                rating = 4.5f,
                type = ProductType.TYPE_3,
                expiringDate = "20/01/2024",
                price = "$2.99",
                isNew = false
            )
        )
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun NewProductListItemPreview() {
    CatalogAppTheme {
        ProductListItem(
            Product(
                id = UUID.randomUUID().toString(),
                iconUrl = "https://picsum.photos/200",
                name = "Bread",
                rating = 4.5f,
                type = ProductType.TYPE_3,
                expiringDate = "20/01/2024",
                price = "$2.99",
                isNew = true
            )
        )
    }
}
