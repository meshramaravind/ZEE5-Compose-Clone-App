package com.arvind.zee5composeapp.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.arvind.zee5composeapp.ui.theme.colorPrimary

@Composable
fun HiPiScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "HiPi Screen",
            color = colorPrimary
        )

    }
}

@Preview(showBackground = true)
@Composable
fun HiPiScreenPreview() {
    HiPiScreen()
}
