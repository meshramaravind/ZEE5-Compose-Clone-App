package com.arvind.zee5composeapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MoreMenuItems() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { }
            .padding(20.dp),
    ) {
        Text(
            text = "",
            style = MaterialTheme.typography.body1,
        )

    }
}