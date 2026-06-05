package com.example.fogn.Vista



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun inicio (){

    LazyColumn(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.safeDrawingPadding()
    ) {
        item {
            itemProductos()
        }
    }
}