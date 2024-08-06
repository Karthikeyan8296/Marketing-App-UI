package com.example.marketingapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marketingapp.data.DocumentData
import com.example.marketingapp.ui.theme.BadgeGreen

@Composable
fun DocumentListComponent(Documents: DocumentData) {

    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = Documents.title,
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = Documents.timeStamp,
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = Color.Gray, fontWeight = FontWeight.Bold
                    )
                )
            }
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.background(color = BadgeGreen, shape = CircleShape)
            ) {
                Icon(imageVector = Icons.Rounded.Add, contentDescription = null, tint = Color.Black)
            }
        }
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.LightGray
        )
    }

}


val DocumentsList = listOf(
    DocumentData(
        id = 0,
        title = "Document verificartion",
        timeStamp = "3 min ago"
    ),
    DocumentData(
        id = 1,
        title = "Newbie onboarding",
        timeStamp = "5 days ago"
    ),
    DocumentData(
        id = 2,
        title = "Team Meeting Notes",
        timeStamp = "2 hours ago"
    ),
    DocumentData(
        id = 3,
        title = "Client Feedback Summary",
        timeStamp = "1 day ago"
    ),
    DocumentData(
        id = 4,
        title = "Budget Allocation Report",
        timeStamp = "3 days ago"
    ),
    DocumentData(
        id = 5,
        title = "Product Launch Plan",
        timeStamp = "1 week ago"
    )
)
