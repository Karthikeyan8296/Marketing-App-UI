package com.example.marketingapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ExpandCircleDown
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.outlined.School
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.HomeWork
import androidx.compose.material.icons.rounded.House
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.School
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Sell
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.twotone.KeyboardArrowDown
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarColors
import androidx.compose.material3.SearchBarDefaults
import com.example.marketingapp.ui.theme.Text
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.traceEventEnd
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marketingapp.ui.components.BottomNavigationBarComponent
import com.example.marketingapp.ui.components.SearchBarComponent
import com.example.marketingapp.ui.components.TitleComponent
import com.example.marketingapp.ui.components.TopAppBarComponent
import com.example.marketingapp.ui.theme.BackgroundWhite
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.marketingapp.data.DocumentData
import com.example.marketingapp.data.processIDdata
import com.example.marketingapp.ui.components.DocumentListComponent
import com.example.marketingapp.ui.components.DocumentsList
import com.example.marketingapp.ui.components.FirstCard
import com.example.marketingapp.ui.components.FlowListComponent
import com.example.marketingapp.ui.components.ProcessCardComponent
import com.example.marketingapp.ui.components.processList
import com.example.marketingapp.ui.theme.BadgeGreen

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    Scaffold(
        topBar = {
            TopAppBarComponent()
        },
        bottomBar = {
            BottomNavigationBarComponent()
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {

            Spacer(modifier = Modifier.height(8.dp))

            SearchBarComponent()

            Spacer(modifier = Modifier.height(46.dp))

            TitleComponent()

            Spacer(modifier = Modifier.height(32.dp))

            LazyRow(
                modifier.fillMaxWidth()
            ) {
                item {
                    FirstCard()
                }
                items(items = processList, key = {it.value}) { process ->
                    ProcessCardComponent(process)
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            FlowListComponent()

            Spacer(modifier = Modifier.height(15.dp))

            LazyColumn(
                Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
            ) {
                items(items = DocumentsList,
                    key = {
                        it.value
                    }
                ) { Documents ->
                    DocumentListComponent(Documents)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}