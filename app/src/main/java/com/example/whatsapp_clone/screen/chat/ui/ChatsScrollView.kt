package com.example.whatsapp_clone.screen.chat.ui

import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp_clone.data.model.Conversation
import com.example.whatsapp_clone.util.colorLightGreen

@Composable
fun ChatsScrollView(chat: List<Conversation>) {
    LazyColumnFor(
        chat,
        modifier = Modifier.fillMaxHeight().background(color = colorLightGreen()).padding(10.dp)
            .padding(bottom = 40.dp)
    ) {
        if (it.id == 2) {
            setupRecipientChat(it)
        } else {
            setupMyChat(it)
        }
        Spacer(modifier = Modifier.padding(8.dp))
    }
}

@OptIn(InternalLayoutApi::class)
@Composable
fun setupMyChat(chat: Conversation) {
    Box(
        backgroundColor = Color(38, 82, 72),
        modifier =  Modifier.padding(80.dp, end = 10.dp)
            .fillMaxWidth()
            .padding(start = 140.dp),
                shape = RoundedCornerShape(8.dp)
        ,
    ) {
        Row(modifier = Modifier.padding(all = 10.dp),
            horizontalArrangement = Arrangement.End) {
            Text(
                text = chat.chat,
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.White
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Right
            )
        }
    }
}

@OptIn(InternalLayoutApi::class)
@Composable
fun setupRecipientChat(chat: Conversation) {
    Box(
        backgroundColor = Color(62, 61, 64),
        modifier =  Modifier.padding(10.dp, end = 80.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(modifier = Modifier.padding(10.dp)) {
            Column {
                Text(
                    text = chat.chat,
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Color.White
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}
