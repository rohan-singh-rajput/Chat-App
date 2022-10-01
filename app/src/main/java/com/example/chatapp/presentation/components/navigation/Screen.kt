package com.example.chatapp.presentation.components.navigation

sealed class Screen(val route:String){
    object Splash : Screen("splash_screen")
    object Login : Screen("login_screen")
    object Signup : Screen("signup_screen")
    object Home : Screen("home_screen")
}
