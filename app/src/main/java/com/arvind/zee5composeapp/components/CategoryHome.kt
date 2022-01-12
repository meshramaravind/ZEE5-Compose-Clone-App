package com.arvind.zee5composeapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arvind.zee5composeapp.data.CategoriesRepository
import com.arvind.zee5composeapp.data.CategoryShow
import com.arvind.zee5composeapp.ui.theme.colorWhite
import com.arvind.zee5composeapp.view.HomeScreen

@Composable
fun CategoryHome() {
    val categoryTitle = remember { CategoriesRepository.categoryList }

    LazyRow(modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)) {
        items(categoryTitle) {
            CategoryListItem(categoryTitle = it)
        }
    }
}

@Composable
fun CategoryListItem(categoryTitle: CategoryShow) {
    Column() {

        Text(
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
                top = 8.dp,
                bottom = 8.dp
            ),
            text = categoryTitle.title,
            color = if (categoryTitle.id == 0) colorWhite else Color.LightGray
        )

        Divider(
            color = if (categoryTitle.id == 0) colorWhite else Color.Transparent,
            modifier = Modifier
                .fillMaxWidth()
                .width(1.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun CategoryHomePreview() {
    CategoryHome()
}

