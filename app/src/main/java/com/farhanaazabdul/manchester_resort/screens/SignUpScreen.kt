package com.farhanaazabdul.manchester_resort.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.farhanaazabdul.manchester_resort.components.ButtonComponent
import com.farhanaazabdul.manchester_resort.components.CheckboxComponent
import com.farhanaazabdul.manchester_resort.components.ClickableLoginTextComponent
import com.farhanaazabdul.manchester_resort.components.DividerTextComponent
import com.farhanaazabdul.manchester_resort.components.HeadingTextComponent
import com.farhanaazabdul.manchester_resort.components.MyTextFieldComponent
import com.farhanaazabdul.manchester_resort.components.PasswordTextFieldComponent
import com.farhanaazabdul.manchester_resort.data.signup.SignupUIEvent
import com.farhanaazabdul.manchester_resort.data.signup.SignupViewModel
import com.farhanaazabdul.manchester_resort.navigation.AppRouter
import com.farhanaazabdul.manchester_resort.navigation.Screen
import com.farhanaazabdul.manchester_resort.R


@Composable
fun SignUpScreen(signupViewModel: SignupViewModel = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(color = Color(R.color .white)),
        contentAlignment = Alignment.Center,

    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(color =  Color(R.color.white))
                .align(Alignment.Center)
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color(R.color.white)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Image(
                    modifier = Modifier.size(150.dp),
                    painter = painterResource(id = R.drawable.manchester_logo), contentDescription = null)
                Spacer(modifier = Modifier.height(10.dp))
                  HeadingTextComponent(value = "Manchester Resort ")
                  Spacer(modifier = Modifier.height(18.dp))
                  MyTextFieldComponent(
                    labelValue = stringResource(id = R.string.first_name),
                    painterResource(id = R.drawable.profile),
                    onTextChanged = {
                        signupViewModel.onEvent(SignupUIEvent.FirstNameChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.firstNameError
                )

                MyTextFieldComponent(
                    labelValue = stringResource(id = R.string.last_name),
                    painterResource = painterResource(id = R.drawable.profile),
                    onTextChanged = {
                        signupViewModel.onEvent(SignupUIEvent.LastNameChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.lastNameError
                )

                MyTextFieldComponent(
                    labelValue = stringResource(id = R.string.email),
                    painterResource = painterResource(id = R.drawable.message),
                    onTextChanged = {
                        signupViewModel.onEvent(SignupUIEvent.EmailChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.emailError
                )

                PasswordTextFieldComponent(
                    labelValue = stringResource(id = R.string.password),
                    painterResource = painterResource(id = R.drawable.ic_lock),
                    onTextSelected = {
                        signupViewModel.onEvent(SignupUIEvent.PasswordChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.passwordError
                )

                CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                    onTextSelected = {
                        AppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                    },
                    onCheckedChange = {
                        signupViewModel.onEvent(SignupUIEvent.PrivacyPolicyCheckBoxClicked(it))
                    }
                )

                Spacer(modifier = Modifier.height(10.dp))

                ButtonComponent(
                    value = stringResource(id = R.string.register),
                    onButtonClicked = {
                        signupViewModel.onEvent(SignupUIEvent.RegisterButtonClicked)
                    },
                    isEnabled = signupViewModel.allValidationsPassed.value
                )

                Spacer(modifier = Modifier.height(10.dp))

                DividerTextComponent()

                ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                    AppRouter.navigateTo(Screen.LoginScreen)
                })
            }
        }


        if(signupViewModel.signUpInProgress.value) {
            CircularProgressIndicator()
        }
    }

}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}