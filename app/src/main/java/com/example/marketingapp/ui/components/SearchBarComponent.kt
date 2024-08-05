package com.example.marketingapp.ui.components


import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun SearchBarComponent() {
    val text by remember {
        mutableStateOf("")
    }

    SearchBar(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        colors = SearchBarDefaults.colors(
            containerColor = Color.White
        ),
        query = text,
        onQueryChange = { },
        onActiveChange = { },
        onSearch = { },
        active = false,
        placeholder = {
            Text(text = "Try to find...", color = Color.Gray)
        },
        leadingIcon = {
            Icon(imageVector = Icons.Rounded.Search, contentDescription = null, tint = Color.Black)
        }
    ) {


    }
}