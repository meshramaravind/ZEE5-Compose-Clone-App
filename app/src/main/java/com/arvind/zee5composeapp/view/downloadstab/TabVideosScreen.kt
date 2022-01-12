package com.arvind.zee5composeapp.view.downloadstab

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.zee5composeapp.R
import com.arvind.zee5composeapp.ui.theme.colorPrimary
import com.arvind.zee5composeapp.ui.theme.colorPurple400
import com.arvind.zee5composeapp.ui.theme.colorPurpleDark
import com.arvind.zee5composeapp.ui.theme.colorWhite

@Composable
fun TabVideosScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorPrimary),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(70.dp))
        Box(
            modifier = Modifier
                .width(185.dp)
                .height(185.dp)
                .padding(12.dp)
                .clip(CircleShape)
                .background(colorPurpleDark),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_downloads),
                contentDescription = "Download Icon",
                modifier = Modifier.size(120.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Looks for this icon to download and watch\n" +
                    "movies,shows and videos offline",
            color = colorWhite,
            textAlign = TextAlign.Center,
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(
                    start = 50.dp,
                    end = 50.dp
                ),
            elevation = ButtonDefaults.elevation(),
            shape = RoundedCornerShape(6.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorPurple400)
        ) {
            Text(
                text = stringResource(id = R.string.text_browse_to_download),
                color = colorWhite,
                fontSize = 12.sp
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun TabVideosScreenPreview() {
    TabVideosScreen()
}
