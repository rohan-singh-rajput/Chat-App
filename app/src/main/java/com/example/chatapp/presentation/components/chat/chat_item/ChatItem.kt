package com.example.chatapp.presentation.components.chat.chat_item

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
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
import com.example.chatapp.R

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ChatItem(){
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(20.dp),
//        backgroundColor = Color(245,245,245)
    ) {
        Row(
            Modifier
                .clickable { Log.d("RowClick","CLicked row elem") }
                .height(90.dp)
                .fillMaxWidth()
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            //profile image
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "null",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Inside)

            Column {
                Text(
                    text = "UserName",
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth(0.80f)
                    )

                Text(text = "Last message",
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth(0.80f)
                   )
            }
            Text(text = "12:49 AM", textAlign = TextAlign.Justify)
        }

    }

}