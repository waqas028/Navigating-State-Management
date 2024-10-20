package com.waqas028.navigating_state_management.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SecondScreen(){
    // UI for the Second screen
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(
            text = "Second Screen",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}