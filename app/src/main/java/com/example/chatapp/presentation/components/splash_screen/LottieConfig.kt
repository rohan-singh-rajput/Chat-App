package com.example.chatapp.presentation.components.splash_screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.chatapp.R


@Composable
fun LottieInit(){
    val composition  by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.logo))
    val logoAnimationState = animateLottieCompositionAsState(composition = composition)
    LottieAnimation(composition = composition, progress = { logoAnimationState.progress })
}
