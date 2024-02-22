package com.example.catalogapp.presentation.ui.compoenents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogapp.R
import com.example.catalogapp.presentation.theme.CatalogAppTheme

private const val ENABLED_ALPHA_FACTOR = 1f
private const val DISABLED_ALPHA_FACTOR = 0.5f

@Composable
fun ListNavigationButton(
    text: String,
    onClick: () -> Unit,
    icon: Painter?,
    isEnabled: Boolean = true,
) {
    val modifier = if (isEnabled) {
        Modifier.alpha(ENABLED_ALPHA_FACTOR).clickable { onClick() }
    } else {
        Modifier.alpha(DISABLED_ALPHA_FACTOR)
    }


    ListItem(
        modifier = modifier,
        headlineContent = { Text(text = text) },
        leadingContent = {
            icon?.let {
                Icon(
                    painter = it,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
            }
        },
        trailingContent = {
            Icon(
                painter = painterResource(R.drawable.ic_navigation_arrow),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        },
    )
}

@Preview(showSystemUi = true)
@Composable
private fun ListNavigationButtonEnabledPreview() {
    CatalogAppTheme {
        ListNavigationButton(
            text = "Button",
            onClick = { },
            icon = painterResource(R.drawable.ic_top_app_bar),
            isEnabled = true
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ListNavigationButtonDisabledPreview() {
    CatalogAppTheme {
        ListNavigationButton(
            text = "Button",
            onClick = { },
            icon = painterResource(R.drawable.ic_top_app_bar),
            isEnabled = false
        )
    }
}
