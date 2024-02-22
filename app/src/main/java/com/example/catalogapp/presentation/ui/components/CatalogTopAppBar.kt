package com.example.catalogapp.presentation.ui.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.catalogapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatalogTopAppBar(title: String) {
    CenterAlignedTopAppBar(
        title = { Text(title) },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(R.drawable.ic_top_app_bar),
                    contentDescription = null
                )
            }
        }
    )
}
