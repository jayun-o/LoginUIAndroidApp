package com.typ.loginappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.typ.loginappui.ui.screen.container.ScreenContainer
import com.typ.loginappui.ui.screen.home.HomeScreen
import com.typ.loginappui.ui.screen.login.LoginScreen
import com.typ.loginappui.ui.screen.registration.RegistrationScreen
import com.typ.loginappui.ui.screen.welcome.WelcomeScreen
import com.typ.loginappui.ui.theme.LoginAppUiTheme
import com.typ.loginappui.ui.screen.registration.RegistrationScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginAppUiTheme {
                ScreenContainer()
            }
        }
    }
}
