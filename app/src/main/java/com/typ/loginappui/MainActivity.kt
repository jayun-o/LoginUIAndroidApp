package com.typ.loginappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.typ.loginappui.ui.screen.login.LoginScreen
import com.typ.loginappui.ui.screen.welcome.WelcomeScreen
import com.typ.loginappui.ui.theme.LoginAppUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginAppUiTheme {
                LoginScreen()
            }
        }
    }
}
