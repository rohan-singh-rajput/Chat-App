package com.example.chatapp.presentation.components.chat.chat_list

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.chatapp.presentation.components.chat.chat_item.ChatItem

@Composable
@Preview(showSystemUi = true)
fun ChatList(){
    LazyColumn(modifier = Modifier.fillMaxSize()){
        item{
            ChatItem()
        }
        item{
            ChatItem()
        }
        item{
            ChatItem()
        }
        item{
            ChatItem()
        }
        item{
            ChatItem()
        }
        item{
            ChatItem()
        }
        item{
            ChatItem()
        }
        item{
            ChatItem()
        }
        item{
            ChatItem()
        }
        item{
            ChatItem()
        }
        







    }
}