package com.example.marketingapp.ui.components

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.marketingapp.R

@Composable
fun TopAppBarComponent() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
            .padding(top = 48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(horizontalAlignment = Alignment.Start, modifier = Modifier.weight(1f)) {
            Text(
                text = "Welcome back,",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray
                )
            )
            Text(
                text = "Carolina Terner",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
            )

        }

        Box(modifier = Modifier.size(52.dp), contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = null,
                Modifier.size(48.dp)
            )

            Box(
                modifier = Modifier
                    .background(Color.Black, CircleShape)
                    .border(2.dp, Color.White, CircleShape)
                    .size(20.dp)
                    .align(Alignment.BottomStart),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "2",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
        }
    }
}