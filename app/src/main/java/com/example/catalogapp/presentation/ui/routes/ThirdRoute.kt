package com.example.catalogapp.presentation.ui.routes

import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.catalogapp.R
import com.example.catalogapp.presentation.theme.CatalogAppTheme
import com.example.catalogapp.presentation.ui.components.ProductListItem2
import com.example.catalogapp.presentation.ui.viewmodel.CatalogViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ThirdRoute(catalogViewModel: CatalogViewModel = viewModel()) {
    val uiState by catalogViewModel.uiState.collectAsStateWithLifecycle()
    val coroutineScope = rememberCoroutineScope()
    val pagerState = rememberPagerState(pageCount = { uiState.tabs.size })
    var currentTabIndex by remember { mutableIntStateOf(0) }

    Column {
        Spacer(modifier = Modifier.height(16.dp))
        
        ProductListItem2(product = uiState.products[0])

        Spacer(modifier = Modifier.height(16.dp))

        ProductListItem2(product = uiState.products[1])

        Spacer(modifier = Modifier.height(16.dp))

        Surface {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(text = "Description Section")
                Text(text = "Item 1")
                Text(text = "Item 2")
            }
        }

        Text(
            text = "Outside bottom item with a very very long description. Maybe not that long.",
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        ScrollableTabRow(
            selectedTabIndex = currentTabIndex,
            edgePadding = 0.dp,
            divider = {}
        ) {
            uiState.tabs.forEachIndexed { index, tab ->
                Tab(
                    text = { Text(text = tab.name) },
                    selected = currentTabIndex == index,
                    onClick = {
                        currentTabIndex = index
                        coroutineScope.launch { pagerState.scrollToPage(index) }
                    }
                )
            }
        }

        HorizontalPager(
            state = pagerState,
            userScrollEnabled = false,
        ) {
            val tab = uiState.tabs[it]

            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = tab.title)
                AsyncImage(
                    model = tab.imageUrl,
                    contentDescription = null,
                    placeholder = painterResource(R.drawable.ic_catalog_app_foreground)
                )
                Text(text = tab.description)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ThirdRoutePreview() {
    CatalogAppTheme {
        ThirdRoute()
    }
}
