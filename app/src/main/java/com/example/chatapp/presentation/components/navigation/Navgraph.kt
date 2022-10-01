package com.example.chatapp.presentation.components.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chatapp.presentation.components.Home
import com.example.chatapp.presentation.components.login_signup.Login
import com.example.chatapp.presentation.components.login_signup.Signup
import com.example.chatapp.presentation.components.splash_screen.LogoSplashScreen


@Composable
fun SetupNavGraph(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Splash.route ){

        //splash screen nav
        composable(route = Screen.Splash.route){
            LogoSplashScreen(navController = navController)
        }

        composable(route = Screen.Login.route) {
            Login(navController = navController)
        }

        composable(route = Screen.Signup.route){
            Signup(navController  = navController)
        }

        composable(route = Screen.Home.route){
            Home()
        }
    }


}