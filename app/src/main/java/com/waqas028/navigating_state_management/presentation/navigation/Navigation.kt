package com.waqas028.navigating_state_management.presentation.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.waqas028.navigating_state_management.presentation.screen.FirstScreen
import com.waqas028.navigating_state_management.presentation.screen.SecondScreen

@Composable
fun Navigation(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Routes.FirstScreen
    ) {

        composable<Routes.FirstScreen>(
            enterTransition = { EnterTransition.None },
            exitTransition = { ExitTransition.None }
        ) {
            FirstScreen(navController)
        }

        composable<Routes.SecondScreen>(
            enterTransition = { EnterTransition.None },
            exitTransition = { ExitTransition.None }
        ) {
            SecondScreen()
        }
    }
}