package com.arvind.zee5composeapp.view

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.zee5composeapp.components.TopBarMore
import com.arvind.zee5composeapp.data.DataMenuDummy
import com.arvind.zee5composeapp.data.MenuItems
import com.arvind.zee5composeapp.ui.theme.*
import com.arvind.zee5composeapp.ui.theme.colorPurpleLight700

@Composable
fun MoreScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorPrimary)
            .verticalScroll(rememberScrollState())
    ) {
        Column() {
            TopBarMore()
            MoreMenu()

        }

    }


}

@Composable
fun MoreMenu() {
    val interactionSource = remember { MutableInteractionSource() }

    Text(
        text = "Buy Plan",
        color = colorWhite,
        style = MaterialTheme.typography.body1,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .clickable(
                interactionSource = interactionSource,
                indication = null
            ) {

            }
    )

    TextButton(onClick = { }) {
        Text(
            text = "My Subscription",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }

    TextButton(onClick = { }) {
        Text(
            text = "My Rentals",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }

    TextButton(onClick = { }) {
        Text(
            text = "My Transaction",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }

    TextButton(onClick = { }) {
        Text(
            text = "Watchlist",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }

    TextButton(onClick = { }) {
        Text(
            text = "Activate TV",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }
    Spacer(modifier = Modifier.height(10.dp))
    VerticalDivider()

    TextButton(onClick = { }) {
        Text(
            text = "Have a Prepaid code?",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }
    VerticalDivider()

    TextButton(onClick = { }) {
        Text(
            text = "Settings",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }
    VerticalDivider()

    TextButton(onClick = { }) {
        Text(
            text = "Invite a Friend",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }
    VerticalDivider()
    TextButton(onClick = { }) {
        Text(
            text = "About Us",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }
    TextButton(onClick = { }) {
        Text(
            text = "Help Center",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }

    TextButton(onClick = { }) {
        Text(
            text = "Grievance Redressal",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }
    VerticalDivider()

    TextButton(onClick = { }) {
        Text(
            text = "Logout",
            color = colorWhite,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }

    VerticalDivider()

    Text(
        text = "Terms of Use . Privacy Policy",
        color = colorText,
        fontSize = 12.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    )

    Text(
        text = "Version 34.1236110.0",
        color = Color.Gray,
        fontSize = 12.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    )
}

@Composable
fun VerticalDivider() {
    Divider(
        color = Color.Gray,
        modifier = Modifier
            .fillMaxWidth()
            .width(1.dp)
    )
}

@Composable
fun MenuListItem(menuTitle: MenuItems) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { }
            .padding(10.dp),
    ) {
        Text(
            text = menuTitle.title,
            color = colorWhite,
            fontSize = 20.sp
        )
        Divider(
            color = Color.Gray,
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))


    }
}


@Composable
@Preview
fun MoreScreenPreview() {
    MoreScreen()
}

@Composable
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun MoreScreenDarkPreview() {
    MoreScreen()
}





