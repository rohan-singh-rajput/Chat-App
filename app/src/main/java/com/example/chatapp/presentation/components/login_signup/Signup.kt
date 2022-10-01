package com.example.chatapp.presentation.components.login_signup

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.chatapp.R
import com.example.chatapp.presentation.components.navigation.Screen

@Composable
//@Preview(showSystemUi = true)
fun Signup(navController : NavController){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
        var username by remember {
        mutableStateOf(TextFieldValue(""))
        }

        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var password by remember {
            mutableStateOf(TextFieldValue(""))
        }

        var confirmPassword by remember {
            mutableStateOf(TextFieldValue(""))
        }

        val composition  by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.logo))
        val logoAnimationState = animateLottieCompositionAsState(composition = composition)
        LottieAnimation(composition = composition, progress = { logoAnimationState.progress }, modifier = Modifier.size(100.dp))

        TextField(value = username,
            onValueChange = { username = it},
            label = {
                Text(text = "username")
            },
            placeholder = {
                Text(text = "username")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Person, contentDescription = null )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))


        TextField(value = email,
            onValueChange = { email = it},
            label = {
                Text(text = "email")
            },
            placeholder = {
                Text(text = "email")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Email, contentDescription = null )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))


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
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))


        TextField(value = confirmPassword,
            onValueChange = { confirmPassword = it},
            label = {
                Text(text = "reenter password")
            },
            placeholder = {
                Text(text = "confirm password")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Lock, contentDescription = null )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
        
        Row(
            verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(12.dp)) {
            Text(text = "Already have an account?")
            Spacer(modifier = Modifier.size(10.dp))
            OutlinedButton(onClick = {
                navController.navigate(Screen.Login.route){
                    popUpTo(0)

            } },border = BorderStroke(1.dp, color = MaterialTheme.colors.primary)) {
                Text(text = "Login")
            }
        }
        
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Register")
        }
    }
}