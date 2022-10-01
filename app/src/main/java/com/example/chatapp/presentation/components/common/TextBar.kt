package com.example.chatapp.presentation.components.common

import android.graphics.drawable.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue


@Composable
fun TextBar(
    value : String,
    onValueChange :(String)-> Unit,
    icon : Icon,
    label :String,
){
    TextField(
        value = value,
        onValueChange =  onValueChange,
        label = {Text(text = label)},
        placeholder = {Text(text = label )},
        leadingIcon = {icon::class.java}
    )
}