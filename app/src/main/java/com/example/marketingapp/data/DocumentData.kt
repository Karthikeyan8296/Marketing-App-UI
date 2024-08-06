package com.example.marketingapp.data

import androidx.compose.runtime.Immutable
import java.util.UUID

@Immutable
data class DocumentData(
    val value : String = UUID.randomUUID().toString(),
    val id : Int,
    val title : String,
    val timeStamp: String
)
