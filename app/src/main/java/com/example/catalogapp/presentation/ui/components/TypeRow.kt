package com.example.catalogapp.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogapp.model.ProductType
import com.example.catalogapp.presentation.theme.CatalogAppTheme

@Composable
fun TypeRow(typeId: String) {
    ProductType.getById(typeId)?.let { type ->
        val typeTitle = stringResource(type.stringRes)

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(2.dp),
        ) {
            Icon(
                painter = painterResource(type.drawableRes),
                contentDescription = null,
                modifier = Modifier.size(9.dp)
            )

            Text(text = typeTitle)
        }
    }
}

@Preview
@Composable
private fun TypeRowPreview(){
    CatalogAppTheme {
        TypeRow(typeId = ProductType.TYPE_1.id)
    }
}
