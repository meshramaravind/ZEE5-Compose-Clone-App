package com.arvind.zee5composeapp.view

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.zee5composeapp.R
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.arvind.zee5composeapp.ui.theme.colorBottomBar
import com.arvind.zee5composeapp.ui.theme.colorWhite
import com.arvind.zee5composeapp.view.downloadstab.DownloadsTabScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun BottomBarZee5(navController: NavController) {
    val sectionState = remember { mutableStateOf(DashboardSection.Home) }
    val navItems = DashboardSection.values().toList()

    Scaffold(
        bottomBar = {
            BottomBar(
                navController = navController,
                items = navItems,
                currentSection = sectionState.value,
            ) { sectionState.value = it }
        }) { innerPadding ->
        val modifier = Modifier.padding(innerPadding)
        Crossfade(
            modifier = modifier,
            targetState = sectionState.value
        )
        { section ->
            when (section) {
                DashboardSection.Home -> HomeScreen()
            }
            when (section) {
                DashboardSection.Upcoming -> UpcomingScreen()
            }
            when (section) {
                DashboardSection.HiPi -> HiPiScreen()
            }
            when (section) {
                DashboardSection.Downloads -> DownloadsTabScreen()
            }
            when (section) {
                DashboardSection.More -> MoreScreen()
            }
        }
    }
}

@Composable
private fun BottomBar(
    navController: NavController,
    items: List<DashboardSection>,
    currentSection: DashboardSection,
    onSectionSelected: (DashboardSection) -> Unit,
) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    BottomNavigation(
        modifier = Modifier.height(60.dp),
        backgroundColor = colorBottomBar,
        contentColor = contentColorFor(MaterialTheme.colors.background)
    ) {
        items.forEach { section ->

            val selected = section == currentSection

            val iconRes = if (selected) section.selectedIcon else section.icon

            val titleText = if (selected) section.title else section.title

            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = iconRes),
                        modifier = Modifier.size(24.dp),
                        contentDescription = "Bottom nav icons"
                    )
                },
                label = {
                    Text(
                        text = titleText,
                        fontSize = 10.sp
                    )
                },
                selected = selected,
                unselectedContentColor = Color.Gray,
                selectedContentColor = colorWhite,
                onClick = { onSectionSelected(section) },
                alwaysShowLabel = true
            )
        }
    }
}

private enum class DashboardSection(
    val icon: Int,
    val selectedIcon: Int,
    val title: String
) {
    Home(R.drawable.ic_baseline_home_24, R.drawable.ic_baseline_home_24, "Home"),
    Upcoming(R.drawable.ic_baseline_upcoming_24, R.drawable.ic_baseline_upcoming_24, "Upcoming"),
    HiPi(R.drawable.ic_baseline_upcoming_24, R.drawable.ic_baseline_upcoming_24, "HiPi"),
    Downloads(R.drawable.ic_downloads, R.drawable.ic_downloads, "Downloads"),
    More(R.drawable.ic_baseline_menu_24, R.drawable.ic_baseline_menu_24, "More"),

}

@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun BottomBarZee5Preview() {
    BottomBarZee5(navController = NavController(LocalContext.current))
}
