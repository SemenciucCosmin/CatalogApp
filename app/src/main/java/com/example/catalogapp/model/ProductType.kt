package com.example.catalogapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.catalogapp.R

enum class ProductType(
    val id: String,
    @StringRes val stringRes: Int,
    @DrawableRes val drawableRes: Int,
) {
    TYPE_1("type_1", R.string.lbl_type_1_product, R.drawable.ic_type_1_product),
    TYPE_2("type_2", R.string.lbl_type_2_product, R.drawable.ic_type_2_product),
    TYPE_3("type_3", R.string.lbl_type_3_product, R.drawable.ic_type_3_product),
    TYPE_4("type_4", R.string.lbl_type_4_product, R.drawable.ic_type_4_product);

    companion object {
        fun getById(id: String) = entries.firstOrNull { it.id == id }
    }
}
