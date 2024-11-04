package com.example.whatsapp_clone.screen.main.view.status

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.whatsapp_clone.data.local.statusList
import com.example.whatsapp_clone.util.colorLightGreen

@Composable
fun StatusView() {
    LazyColumnFor(statusList, modifier = Modifier.background(color = colorLightGreen())) { status ->
        StatusItemView(status)
        Divider()
    }
}