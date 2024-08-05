package com.example.marketingapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marketingapp.data.processIDdata
import com.example.marketingapp.ui.theme.BackgroundWhite
import com.example.marketingapp.ui.theme.Text

val processList =
    listOf<processIDdata>(
        processIDdata(id = 0, context = "Verification process with team"),
        processIDdata(id = 1, context = "Managing the\nteam lunc"),
        processIDdata(id = 2, context = "Planning the project timeline"),
        processIDdata(id = 3, context = "Organizing team-building activities"),
    )

@Composable
fun ProcessCardComponent(process : processIDdata) {

    val card = processList[process.id]

    var lastItemPadding = 0.dp

    if (process.id == processList.size - 1) {
        lastItemPadding = 24.dp
    }

    Box(
        modifier = Modifier
            .width(180.dp)
            .height(140.dp)
            .padding(start = 24.dp)
            .padding(end = lastItemPadding)
            .shadow(elevation = 2.dp, shape = RoundedCornerShape(24.dp))
            .background(color = Color.White, shape = RoundedCornerShape(24.dp)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceAround,
        ) {

            Box(
                modifier = Modifier
                    .width(80.dp)
                    .height(36.dp)
                    .background(color = BackgroundWhite, shape = RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Review",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                )
            }

            Text(
                text = process.context,
                style = TextStyle(
                    color = Text,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
            )

        }
    }

}
