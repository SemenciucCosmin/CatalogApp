package com.example.catalogapp.presentation.ui.routes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogapp.R
import com.example.catalogapp.presentation.theme.CatalogAppTheme
import com.example.catalogapp.presentation.ui.components.ListNavigationButton

@Composable
fun FourthRoute() {
    Column {
        Spacer(modifier = Modifier.height(16.dp))

        ListNavigationButton(
            text = "Button 1",
            onClick = { },
            icon = null
        )

        Spacer(modifier = Modifier.height(16.dp))

        ListNavigationButton(
            text = "Button 2",
            onClick = { },
            icon = null
        )

        Spacer(modifier = Modifier.height(16.dp))

        ListNavigationButton(
            text = "Button 3",
            onClick = { },
            icon = null,
            isEnabled = false
        )

        Spacer(modifier = Modifier.height(16.dp))

        ListNavigationButton(
            text = "Button 4",
            onClick = { },
            icon = painterResource(R.drawable.ic_first)
        )

        ListNavigationButton(
            text = "Button 5",
            onClick = { },
            icon = painterResource(R.drawable.ic_second)
        )

        ListNavigationButton(
            text = "Button 6",
            onClick = { },
            icon = painterResource(R.drawable.ic_third),
            isEnabled = false
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun FourthRoutePreview() {
    CatalogAppTheme {
        FourthRoute()
    }
}
