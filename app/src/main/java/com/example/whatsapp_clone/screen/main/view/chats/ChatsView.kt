package com.example.whatsapp_clone.screen.main.view.chats

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.whatsapp_clone.data.local.chatsList
import com.example.whatsapp_clone.data.model.User
import com.example.whatsapp_clone.util.colorLightGreen

@Composable
fun ChatsView(loadNextScreen: (User) -> Unit) {
    LazyColumnFor(chatsList, modifier = Modifier.background(color = colorLightGreen())) { chat ->
        ChatsItemView(chat, loadNextScreen)
        Divider()
    }
}