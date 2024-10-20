package com.waqas028.navigating_state_management.presentation.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.waqas028.navigating_state_management.MainViewModel
import com.waqas028.navigating_state_management.presentation.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun FirstScreen(navController: NavHostController, viewModel: MainViewModel = hiltViewModel()) {
    val context = LocalContext.current
    val isLoading = viewModel.isLoading
    val verifyOtpResponse = viewModel.verifyOtpResponse

    LaunchedEffect(verifyOtpResponse) {
        verifyOtpResponse?.let {
            Toast.makeText(context, "OTP Verified Successfully!", Toast.LENGTH_SHORT).show()
            if(it) {
                delay(300)
                navController.navigate(Routes.SecondScreen)
            }
        }
    }

    // UI for the first screen
    Box(
        modifier = Modifier.fillMaxSize()
            .navigationBarsPadding(),
    ){
        Text(
            text = "First Screen",
            modifier = Modifier.align(Alignment.Center)
        )
        Button(
            onClick = { viewModel.verifyOTP() },
            modifier = Modifier.align(Alignment.BottomCenter)
                .padding(bottom = 20.dp)
        ) {
            Text(text = "Verify OTP")
        }

        if(isLoading) CustomCircularProgressBar()
    }
}