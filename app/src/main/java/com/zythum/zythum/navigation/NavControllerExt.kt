package com.zythum.zythum.navigation

import androidx.navigation.NavController
import com.zythum.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}
