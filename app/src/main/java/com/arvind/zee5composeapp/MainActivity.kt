package com.arvind.zee5composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arvind.zee5composeapp.navigation.Navigation
import com.arvind.zee5composeapp.ui.theme.ZEE5ComposeAppTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZEE5ComposeAppTheme {
                Zee5ComposeUIMain()
            }
        }
    }

    @ExperimentalPagerApi
    @Composable
    fun Zee5ComposeUIMain() {
        ZEE5ComposeAppTheme {
            Surface(color = MaterialTheme.colors.background) {
                Navigation()
            }
        }
    }

    @ExperimentalPagerApi
    @Preview(showBackground = true)
    @Composable
    fun Zee5ComposeUIMainPreview() {
        Zee5ComposeUIMain()
    }
}

