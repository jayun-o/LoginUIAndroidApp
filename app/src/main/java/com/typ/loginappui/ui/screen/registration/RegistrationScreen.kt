package com.typ.loginappui.ui.screen.registration

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.typ.loginappui.R
import com.typ.loginappui.ui.components.AuthenticationScreenTemplate
import com.typ.loginappui.ui.theme.PrimaryViolet
import com.typ.loginappui.ui.theme.PrimaryVioletDark
import com.typ.loginappui.ui.theme.PrimaryVioletLight

@Composable
fun RegistrationScreen(
    modifier: Modifier = Modifier,
    onRegisterClicked: () -> Unit,
    onLoginClicked: () -> Unit
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to PrimaryViolet,
            1f to PrimaryVioletDark
        ),
        imgRes = R.drawable.img_coder_w,
        title = "Hi there!",
        subtitle = "Let's Get Started",
        mainActionButtonTitle = "Create an Account",
        secondaryActionButton = "Log In",
        mainActionButtonColors =  ButtonDefaults.buttonColors(
            containerColor = PrimaryVioletDark,
            contentColor = Color.White),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryVioletLight,
            contentColor = Color.White
        ),
        actionButtonShadow = PrimaryVioletDark,
        onMainActionButtonClicked = onRegisterClicked,
        onSecomdaryActionButtonClicked = onLoginClicked
    )
}