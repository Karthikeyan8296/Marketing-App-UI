package com.example.marketingapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.marketingapp.ui.components.TopAppBarComponent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    Column(Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                TopAppBarComponent()
            }
        ) {

            //SearchBarComponent()
            //spacer
            //TitleComponent()
            //spacer
            //CardComponent()
            //spacer
            //FlowListComponent
            //spacer
            //DocumentListComponent()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}