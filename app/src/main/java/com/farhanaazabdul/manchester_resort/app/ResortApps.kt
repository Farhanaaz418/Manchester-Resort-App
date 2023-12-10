package com.farhanaazabdul.manchester_resort.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.farhanaazabdul.manchester_resort.data.home.HomeViewModel
import com.farhanaazabdul.manchester_resort.navigation.AppRouter
import com.farhanaazabdul.manchester_resort.navigation.Screen
import com.farhanaazabdul.manchester_resort.screens.HomeScreen
import com.farhanaazabdul.manchester_resort.screens.LoginScreen
import com.farhanaazabdul.manchester_resort.screens.SignUpScreen
import com.farhanaazabdul.manchester_resort.screens.TermsAndConditionsScreen


@Composable
fun ResortApps(homeViewModel: HomeViewModel = viewModel()) {

    homeViewModel.checkForActiveSession()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {

        if (homeViewModel.isUserLoggedIn.value == true) {
            AppRouter.navigateTo(Screen.HomeScreen)
        }

        Crossfade(targetState = AppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }

                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }

                is Screen.LoginScreen -> {
                    LoginScreen()
                }

                is Screen.HomeScreen -> {
                    HomeScreen()
                }
            }
        }

    }
}