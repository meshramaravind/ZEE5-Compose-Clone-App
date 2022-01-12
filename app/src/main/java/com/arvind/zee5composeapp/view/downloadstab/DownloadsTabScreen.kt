package com.arvind.zee5composeapp.view.downloadstab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.MusicVideo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.zee5composeapp.ui.theme.colorPrimary
import com.arvind.zee5composeapp.ui.theme.colorWhite
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

@ExperimentalPagerApi
@Composable
fun DownloadsTabScreen() {
    Column {

        TabScreen()
    }
}

@ExperimentalPagerApi
@Composable
fun TabScreen() {
    val pagerState = rememberPagerState(pageCount = 3)

    Column(
        modifier = Modifier.background(Color.White)
    )
    {
        Tabs(pagerState = pagerState)
        TabsContent(pagerState = pagerState)

    }
}


@ExperimentalPagerApi
@Composable
fun Tabs(pagerState: PagerState) {
    val list = listOf("Shows", "Movies", "Videos")
    val lists = listOf(
        Icons.Filled.Home,
        Icons.Filled.MusicVideo,
        Icons.Filled.Movie

    )
    val scope = rememberCoroutineScope()
    TabRow(selectedTabIndex = pagerState.currentPage,
        backgroundColor = colorPrimary,
        contentColor = Color.White,
        divider = {
            TabRowDefaults.Divider(
                thickness = 3.dp,
                color = colorPrimary
            )
        },
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 2.dp,
                color = colorWhite
            )

        }
    ) {
        list.forEachIndexed { index, _ ->
            Tab(
                text = {
                    Text(
                        text = list[index],
                        fontSize = 12.sp,
                        color = if (pagerState.currentPage == index) Color.White else Color.LightGray
                    )
                },
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
//                icon = {
//                    Icon(imageVector = lists[index], contentDescription = null)
//                }
            )
        }

    }

}

@ExperimentalPagerApi
@Composable
fun TabsContent(pagerState: PagerState) {

    HorizontalPager(state = pagerState) { page ->
        when (page) {
            0 -> TabShowsScreen()
            1 -> TabMoviesScreen()
            2 -> TabVideosScreen()
        }

    }

}

@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun DownloadsTabScreenPreview() {
    DownloadsTabScreen()
}

