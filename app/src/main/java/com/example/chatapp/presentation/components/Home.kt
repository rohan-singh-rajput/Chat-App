package com.example.chatapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.R
import com.example.chatapp.presentation.components.chat.chat_list.ChatList


@Composable
@Preview(showSystemUi = true)
fun Home(){
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colors.primary),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "null",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Inside)

            Text(text = "Messages", color = Color.White, fontSize = 20.sp, textAlign = TextAlign.Center)
        }

        Card(elevation = 20.dp,
            modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))) {
            ChatList()
        }
    }

}