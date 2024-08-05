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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marketingapp.ui.theme.BackgroundWhite
import com.example.marketingapp.ui.theme.BadgeGreen
import com.example.marketingapp.ui.theme.Text

@Composable
fun FirstCard(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .width(160.dp)
            .height(140.dp)
            .padding(start = 24.dp)
            .background(BackgroundWhite, shape = RoundedCornerShape(24.dp))
            .drawBehind {
                drawRoundRect(
                    color = Color.Gray,
                    cornerRadius = CornerRadius(24.dp.toPx()),
                    style = Stroke(
                        width = 3f,
                        pathEffect = PathEffect.dashPathEffect(
                            floatArrayOf(10f, 10f), 0f
                        )
                    )
                )
            },
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
                    .width(90.dp)
                    .height(36.dp)
                    .background(color = BadgeGreen, shape = RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Add task",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                )
            }

            Text(
                text = "Creatives\nfor branging",
                style = TextStyle(
                    color = Text,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            )

        }
    }

}