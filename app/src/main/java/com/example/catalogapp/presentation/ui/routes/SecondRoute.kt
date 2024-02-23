package com.example.catalogapp.presentation.ui.routes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogapp.presentation.theme.CatalogAppTheme
import com.example.catalogapp.presentation.ui.components.PrimaryButton
import com.example.catalogapp.presentation.ui.components.SheetContent
import com.example.catalogapp.presentation.ui.components.SmallPrimaryButton
import com.example.catalogapp.utils.hideThenRun

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondRoute() {
    val sheetState = rememberModalBottomSheetState()
    var showModalBottomSheet by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface {
            PrimaryButton(
                text = "Click to open ModalBottomSheet",
                onClick = { showModalBottomSheet = true },
                modifier = Modifier.padding(16.dp)
            )
        }

        SmallPrimaryButton(
            text = "Click",
            onClick = { showModalBottomSheet = true }
        )

        Text(text = "Text used on non surface (Scaffold -> Column)")

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            CircularProgressIndicator()
            Switch(checked = false, onCheckedChange = {})
            Switch(checked = true, onCheckedChange = {})
        }
    }
    if (showModalBottomSheet) {
        ModalBottomSheet(
            sheetState = sheetState,
            onDismissRequest = { showModalBottomSheet = false },
            dragHandle = {
                Text(
                    text = "ModalBottomSheet",
                    modifier = Modifier.padding(16.dp)
                )
            }
        ) {
            SheetContent(
                onClick = {
                    sheetState.hideThenRun(coroutineScope) {
                        showModalBottomSheet = false
                    }
                }
            )
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
