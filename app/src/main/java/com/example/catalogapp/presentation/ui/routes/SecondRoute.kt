package com.example.catalogapp.presentation.ui.routes

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogapp.presentation.theme.CatalogAppTheme
import com.example.catalogapp.presentation.ui.compoenents.CatalogTopAppBar
import com.example.catalogapp.presentation.ui.compoenents.PrimaryButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondRoute() {
    val sheetState = rememberModalBottomSheetState()
    var showModalBottomSheet by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        PrimaryButton(
            text = "Click to open ModalBottomSheet",
            onClick = { showModalBottomSheet = true }
        )
    }
    if (showModalBottomSheet) {
        ModalBottomSheet(
            sheetState = sheetState,
            onDismissRequest = { showModalBottomSheet = false },
            dragHandle = { CatalogTopAppBar(title = "ModalBottomSheet") }
        ) {
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun SecondRoutePreview() {
    CatalogAppTheme {
        SecondRoute()
    }
}
