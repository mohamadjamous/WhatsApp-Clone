package com.example.whatsapp_clone.screen.main.view.call

import androidx.compose.foundation.Box
import androidx.compose.foundation.ContentGravity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp_clone.data.model.Call
import com.example.whatsapp_clone.util.ImageLoader
import com.example.whatsapp_clone.util.colorGreen

@OptIn(InternalLayoutApi::class)
@Composable
fun CallItem(call: Call) {

    val padding = 16.dp

    Column(Modifier.padding(padding).fillMaxWidth()) {
        Row(verticalGravity = Alignment.CenterVertically) {

            Box(shape = CircleShape, modifier = Modifier.size(40.dp)) {
                ImageLoader(call.imageUrl)
            }
            Column(modifier = Modifier.padding(start = padding)) {
                Text(call.name, style = TextStyle(color= Color.White))
                Text(
                    call.time,
                    style = TextStyle(
                        fontSize = 12.sp,
                        color = colorGreen(),
                        textAlign = TextAlign.Center
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Box(modifier = Modifier.fillMaxWidth(), gravity = ContentGravity.CenterEnd) {
                ImageLoader(call.voiceStatus, modifier = Modifier)
            }
        }
    }
}
