package com.example.jakalacodechallenge.ui

import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SmallDivider(
    modifier: Modifier = Modifier
) {
    HorizontalDivider(
        thickness = 1.dp,
        color = Color.White,
        modifier = modifier
    )
}