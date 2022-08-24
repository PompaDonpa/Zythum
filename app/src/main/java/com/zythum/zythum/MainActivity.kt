package com.zythum.zythum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zythum.core.navigation.Route
import com.zythum.onboarding_presentation.welcome.WelcomeScreen
import com.zythum.zythum.navigation.navigate
import com.zythum.zythum.ui.theme.ZythumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZythumTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Route.WELCOME
                ){
                    composable(Route.WELCOME){
                        WelcomeScreen(onNavigate = navController::navigate)
                    }
                    composable(Route.SEARCH){}
                    composable(Route.AUTOCOMPLETE){}
                    composable(Route.BY_CITY){}
                    composable(Route.BY_DIST){}
                    composable(Route.BY_POSTAL){}
                    composable(Route.BY_STATE){}
                    composable(Route.BY_TYPE){}
                    composable(Route.LIST_BREWERIES){}
                    composable(Route.PER_PAGE){}
                    composable(Route.RANDOM){}
                    composable(Route.SINGLE_BREWERY){}
                    composable(Route.SORT_ASC){}
                    composable(Route.SOT_DESC){}
            }
        }
    }}}

