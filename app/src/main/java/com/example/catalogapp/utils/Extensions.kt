package com.example.catalogapp.utils

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
internal fun SheetState.hideThenRun(coroutineScope: CoroutineScope, block: () -> Unit) {
    coroutineScope.launch { this@hideThenRun.hide() }.invokeOnCompletion { block() }
}
