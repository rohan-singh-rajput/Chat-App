package com.example.chatapp.presentation.components.login_signup


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.chatapp.R
import com.example.chatapp.presentation.components.navigation.Screen

@Composable
fun Login(
    navController : NavController,
    modifier:Modifier = Modifier
){
    var userNameText by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        //lottie
        val composition  by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.logo))
        val logoAnimationState = animateLottieCompositionAsState(composition = composition)
        LottieAnimation(
            composition = composition,
            progress = { logoAnimationState.progress },
            modifier
                .size(300.dp))

        TextField(
            value = userNameText,
            onValueChange = { userNameText = it },
            label = {
                Text(text = "username")
            }, 
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Person, contentDescription = null )
            },
            placeholder = {
                Text(text = "enter your username")
            },
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp),
        )

        TextField(value = password,
            onValueChange = { password = it},
            label = {
                Text(text = "password")
            },
            placeholder = {
                Text(text = "enter your password")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Lock, contentDescription = null )
            }
            ,
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp))

        Button(onClick = { navController.navigate(Screen.Home.route){
            popUpTo(0)
        } }) {
            Text(text = "Login")
        }

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "New User?", modifier = modifier.padding(12.dp))

            OutlinedButton(onClick = { navController.navigate(Screen.Signup.route) },
            border = BorderStroke(1.dp, color = MaterialTheme.colors.primary)
            ) {
                Text(text ="Signup" )
            }
        }
    }
}


