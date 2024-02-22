package com.example.catalogapp.presentation.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.catalogapp.presentation.theme.CatalogAppTheme

@Composable
fun PrimaryOutlinedButton(
    modifier: Modifier = Modifier,
    text: String,
    cornerRadius: Dp,
    onClick: () -> Unit,
    enabled: Boolean = true,
) {
    OutlinedButton(
        onClick = onClick,
        enabled = enabled,
        shape = RoundedCornerShape(cornerRadius),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
        )
    }
}

@Preview
@Composable
private fun PrimaryOutlinedButtonPreview() {
    CatalogAppTheme {
        PrimaryOutlinedButton(
            text = "Primary Button",
            cornerRadius = 25.dp,
            onClick = { }
        )
    }
}