package com.arvind.zee5composeapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arvind.zee5composeapp.R
import com.arvind.zee5composeapp.ui.theme.colorBottomBar
import com.arvind.zee5composeapp.ui.theme.colorPrimary
import com.arvind.zee5composeapp.ui.theme.colorWhite

@Composable
fun TopBarHome() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(colorPrimary)
            .padding(top = 6.dp, start = 10.dp, end = 6.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Image(
            painter = painterResource(R.drawable.zee5_logo_one),
            contentDescription = "avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(44.dp)
                .clip(CircleShape)

        )

        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search for Movies Shows, Channels etc.",
                tint = colorWhite
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarHomePreview() {
    TopBarHome()
}