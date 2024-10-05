package com.typ.loginappui.ui.screen.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import com.typ.loginappui.R
import com.typ.loginappui.ui.theme.PrimaryPink
import com.typ.loginappui.ui.theme.PrimaryPinkBlended
import com.typ.loginappui.ui.theme.PrimaryPinkDark
import com.typ.loginappui.ui.theme.PrimaryPinkLight
import com.typ.loginappui.ui.components.AuthenticationScreenTemplate

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to PrimaryPinkBlended,
            1f to PrimaryPink
        ),
        imgRes = R.drawable.img_coder_m,
        title = "Welcome back!",
        subtitle = "Please, Log in.",
        mainActionButtonTitle = "Continue",
        secondaryActionButton = "Create an Account",
        mainActionButtonColors =  ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkDark,
            contentColor = Color.White),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkLight,
            contentColor = Color.White
        ),
        actionButtonShadow = PrimaryPinkDark,
        onMainActionButtonClicked = { /*TO DO*/ },
        onSecomdaryActionButtonClicked = { /* TO DO */ }
    )
}

