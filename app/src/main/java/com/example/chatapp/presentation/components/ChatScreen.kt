package com.example.chatapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun ChatScreen(modifier:Modifier = Modifier){
    var msg by remember {
        mutableStateOf(TextFieldValue(" "))
    }

    Column() {
        //chat navigation  and name
        Row(
            modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(color = MaterialTheme.colors.primary),
            verticalAlignment = Alignment.CenterVertically
        ){
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
            }
            Text(text = "Username", fontSize = 15.sp)
        }

        //chat body
        LazyColumn(modifier.weight(1f)){
            //user
        }


        //lower msg send body
        Row(modifier
            .height(50.dp)
            .fillMaxWidth()){
            TextField(
                value = msg,
                onValueChange = { msg = it },
                label = {Text(text = "message ...")},
                placeholder = { Text(text = "enter message")}
            )
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Send, contentDescription = null )
            }
        }
    }
}