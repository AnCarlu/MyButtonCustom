package com.example.myfirstbuttonlibrary.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyButtonCustom(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    border: BorderStroke? = null,
    text: String,
    icon: Int? = null,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick.invoke() },
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        border = border
    ) {
        Row() {
            if (icon != null) {
                Icon(painter = painterResource(id = icon), contentDescription = "")
            }
            Text(text = text)
        }
    }
}

@Preview
@Composable
fun Preview() {
    MaterialTheme {
        Column {
            MyButtonCustom(text = "HAZ CLICK AQUI") {

            }
            MyButtonCustom(
                text = "HAZ CLICK AQUI 2",
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {

            }
            MyButtonCustom(
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                text = "HAZ CLICK AQUI 3"

            ) {

            }
        }
    }
}