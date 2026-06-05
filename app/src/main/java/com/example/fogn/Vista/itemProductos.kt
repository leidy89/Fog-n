package com.example.fogn.Vista

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fogn.R


@Composable
fun itemProductos (productos:Productos){
   a

    Row()
    {
        Image(painter= painterResource(productos.imagenProducto),contentDescription="Imagen")
        Spacer(modifier=Modifier.width(30.dp))
        Text(" ${productos.nombreProducto}")
        Spacer(modifier = Modifier.width(30.dp))
        Text("${productos.precioProducto}")
    }
}