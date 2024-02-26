package com.example.catalogapp.presentation.ui.components

import android.content.res.Configuration
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogapp.model.Category
import com.example.catalogapp.model.Product
import com.example.catalogapp.model.ProductType
import com.example.catalogapp.presentation.theme.CatalogAppTheme
import java.util.UUID
import kotlin.random.Random

private const val CATEGORY_PAGE_SIZE = 3

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoryListItem(category: Category) {
    val pages = category.products.chunked(CATEGORY_PAGE_SIZE)
    val pagerState = rememberPagerState(pageCount = { pages.count() })

    Surface {
        Column {
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 8.dp)
            ) {
                Text(
                    text = category.name,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.weight(1f)
                )

                TextButton(onClick = { }) {
                    Text(text = "See All")
                }
            }

            HorizontalPager(
                state = pagerState,
                contentPadding = PaddingValues(end = 24.dp),
                verticalAlignment = Alignment.Top,
                modifier = Modifier.animateContentSize()
            ) { pageIndex ->
                val currentPage = pages[pageIndex]

                Column {
                    for (product in currentPage) {
                        ProductListItem2(product = product)

                        if (product != currentPage.lastOrNull()) {
                            Divider(modifier = Modifier.padding(start = 80.dp))
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun CategoryListItemPreview() {
    CatalogAppTheme {
        CategoryListItem(
            Category(
                id = UUID.randomUUID().toString(),
                name = "Category Name",
                products = List(9) {
                    Product(
                        id = UUID.randomUUID().toString(),
                        iconUrl = "https://picsum.photos/200",
                        name = "Product Name",
                        rating = Random.nextInt(0, 50).toFloat() / 10,
                        type = ProductType.TYPE_3,
                        expiringDate = "12/12/2024",
                        price = "$${Random.nextInt(0, 50).toFloat() / 10}",
                        isNew = Random.nextBoolean()
                    )
                }
            )
        )
    }
}
