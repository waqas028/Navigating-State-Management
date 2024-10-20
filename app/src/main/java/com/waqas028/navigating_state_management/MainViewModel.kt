package com.waqas028.navigating_state_management

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    var isLoading by mutableStateOf(false)

    var verifyOtpResponse by mutableStateOf<Boolean?>(null)
        private set
    fun verifyOTP() = viewModelScope.launch {
        isLoading = true
        delay(3000)
        isLoading = false
        verifyOtpResponse = true
    }
}