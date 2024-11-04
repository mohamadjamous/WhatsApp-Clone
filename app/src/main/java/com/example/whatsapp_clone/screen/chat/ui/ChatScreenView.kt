package com.example.whatsapp_clone.screen.chat.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.whatsapp_clone.data.local.chat
import com.example.whatsapp_clone.data.model.User

@OptIn(ExperimentalMaterialApi::class)
@ExperimentalFoundationApi
@Composable
fun ChatScreenView(user: User, onBackIconClick: () -> Unit, onMessageSend: (String) -> Unit) {
    Scaffold(
        bottomBar = { EditText(onMessageSend) },
        topBar = {
            ChatTopBar(user, onBackIconClick)
        },
        bodyContent = {
            ChatsScrollView(chat.toList())
        }
    )
}