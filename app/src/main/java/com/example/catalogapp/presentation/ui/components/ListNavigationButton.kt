package com.example.catalogapp.presentation.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
        Modifier
            .alpha(ENABLED_ALPHA_FACTOR)
            .clickable { onClick() }
    } else {
        Modifier.alpha(DISABLED_ALPHA_FACTOR)
    }

    Surface(modifier = modifier) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            icon?.let {
                Icon(
                    painter = it,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
            }

            Text(
                text = text,
                modifier = Modifier.weight(1f)
            )

            Icon(
                painter = painterResource(R.drawable.ic_navigation_arrow),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ListNavigationButtonEnabledPreview() {
    CatalogAppTheme {
        ListNavigationButton(
            text = "Button",
            onClick = { },
            icon = null,
            isEnabled = true
        )
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
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
