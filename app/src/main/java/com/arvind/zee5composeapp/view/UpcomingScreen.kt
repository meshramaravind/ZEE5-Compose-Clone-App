package com.arvind.zee5composeapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.zee5composeapp.components.TopBarUpcoming
import com.arvind.zee5composeapp.data.DataUpcomingDummy
import com.arvind.zee5composeapp.data.UpcomingItems
import com.arvind.zee5composeapp.ui.theme.colorPrimary
import com.arvind.zee5composeapp.ui.theme.colorWhite

@Composable
fun UpcomingScreen() {
    Scaffold(topBar = {
        TopBarUpcoming(title = "Upcoming")
    },
        backgroundColor = colorPrimary,
        content = {
            val upcomingTitle = remember { DataUpcomingDummy.upcomingList }

            LazyColumn(modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)) {
                items(upcomingTitle) {
                    UpcomingListItem(upcomingTitle = it)
                }
            }
        })
}

@Composable
fun UpcomingListItem(upcomingTitle: UpcomingItems) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
    ) {

        Image(
            painter = painterResource(id = upcomingTitle.upcomingImageId),
            contentDescription = "Upcoming Image Poster",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clickable { }

        )

        Text(
            text = upcomingTitle.releaseDateTitle,
            color = Color.Gray,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(8.dp),
        )

        Text(
            text = upcomingTitle.trailerTitle,
            color = colorWhite,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(8.dp)
        )

        Text(
            text = upcomingTitle.trailerDescription,
            style = MaterialTheme.typography.body1,
            color = colorWhite,
            modifier = Modifier
                .padding(8.dp)
        )

        Text(
            text = upcomingTitle.trailerCategory,
            color = Color.Gray,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(8.dp),
        )
    }

}

@Preview(showBackground = true)
@Composable
fun UpcomingScreenPreview() {
    UpcomingScreen()
}

