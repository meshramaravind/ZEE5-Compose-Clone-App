package com.arvind.zee5composeapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.zee5composeapp.R
import com.arvind.zee5composeapp.ui.theme.Purple200
import com.arvind.zee5composeapp.ui.theme.colorAppBar
import com.arvind.zee5composeapp.ui.theme.colorPurpleLight700
import com.arvind.zee5composeapp.ui.theme.colorWhite

@Composable
fun TopBarMore() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(colorAppBar)
            .padding(top = 6.dp)
            .clickable { },
    ) {
        Box(
            modifier = Modifier
                .width(70.dp)
                .height(70.dp)
                .padding(12.dp)
                .clip(CircleShape)
                .background(colorPurpleLight700),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_person),
                contentDescription = "Person Icon",
                modifier = Modifier.size(20.dp)
            )
        }

        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .weight(0.9f)
                .wrapContentHeight()
                .padding(top = 6.dp)
        ) {
            Text(
                text = "Arvind Meshram",
                fontSize = 18.sp,
                color = colorWhite,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "meshramaravind@gmail.com",
                fontSize = 14.sp,
                color = Color.Gray,
            )
        }


        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Outlined.KeyboardArrowRight,
                contentDescription = "",
                tint = Purple200
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarMorePreview() {
    TopBarMore()
}
