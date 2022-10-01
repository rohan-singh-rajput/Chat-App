package com.example.chatapp.presentation.components.splash_screen


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.*
import com.example.chatapp.R
import com.example.chatapp.presentation.components.navigation.Screen

@Composable
fun LogoSplashScreen(navController : NavHostController){
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            val composition  by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.logo))
            val logoAnimationState = animateLottieCompositionAsState(composition = composition)
            LottieAnimation(composition = composition, progress = { logoAnimationState.progress })
            if(logoAnimationState.isAtEnd && logoAnimationState.isPlaying){
               navController.navigate(Screen.Login.route){
                   popUpTo(0)
               }
            }
            
            Text(text = "My Chat", textAlign = TextAlign.Center,
                fontWeight =  FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 20.sp)
        }
}