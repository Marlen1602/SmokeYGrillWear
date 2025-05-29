package com.example.smokeygrillwear.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.wear.compose.material.ScalingLazyColumn

@Composable
fun InputScreen(navController: NavHostController) {
    var pedido by remember { mutableStateOf("") }

    ScalingLazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(
            vertical = 16.dp,
            horizontal = 8.dp
        )
    ) {
        item {
            Text(
                text = "Ingresa tu número de pedido",
                fontSize = 14.sp,
                color = Color(0xFF333333),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
            )
        }


        item {
            TextField(
                value = pedido,
                onValueChange = { pedido = it },
                placeholder = {
                    Text("Número de pedido", color = Color(0xFF888888))
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                singleLine = true,
                modifier = Modifier
                    .width(180.dp) // 🟠 Ajuste que evita recorte en redondo
                    .padding(bottom = 14.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFFFCC80),
                    unfocusedContainerColor = Color(0xFFFFE0B2),
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black
                )
            )
        }

        item {
            Button(
                onClick = {
                    navController.navigate("estado")
                },
                modifier = Modifier
                    .width(120.dp) // botón más compacto
                    .height(36.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF6D00),
                    contentColor = Color.White
                ),
                shape = MaterialTheme.shapes.small
            ) {
                Text("Consultar", fontSize = 13.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInputScreen() {
    InputScreen(navController = rememberNavController())
}
