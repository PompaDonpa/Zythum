package com.zythum.zythum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.zythum.onboarding_presentation.welcome.WelcomeScreen
import com.zythum.zythum.ui.theme.ZythumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZythumTheme {
                WelcomeScreen()
            }
        }
    }
}

