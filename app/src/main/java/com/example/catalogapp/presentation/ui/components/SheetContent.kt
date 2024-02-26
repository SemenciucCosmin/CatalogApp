package com.example.catalogapp.presentation.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogapp.presentation.theme.CatalogAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SheetContent(onClick: () -> Unit) {
    var text by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "On Background:",
                modifier = Modifier.weight(1f)
            )

            FilterChip(
                selected = true,
                onClick = { },
                label = { Text(text = "Selected") }
            )

            FilterChip(
                selected = false,
                onClick = { },
                label = { Text(text = "Unselected") }
            )
        }

        Surface {
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "On Surface:",
                    modifier = Modifier.weight(1f)
                )

                FilterChip(
                    selected = true,
                    onClick = { },
                    label = { Text(text = "Selected") }
                )

                FilterChip(
                    selected = false,
                    onClick = { },
                    label = { Text(text = "Unselected") }
                )
            }
        }

        PrimaryOutlinedButton(
            text = "Click to close the ModalBottomSheet",
            cornerRadius = 25.dp,
            onClick = onClick
        )

        PrimaryOutlinedButton(
            text = "Click to close the ModalBottomSheet",
            cornerRadius = 2.5.dp,
            onClick = onClick
        )

        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text(text = "Type your text here") },
            shape = MaterialTheme.shapes.extraSmall,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 120.dp)
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun SheetContentPreview() {
    CatalogAppTheme {
        SheetContent(onClick = { })
    }
}
