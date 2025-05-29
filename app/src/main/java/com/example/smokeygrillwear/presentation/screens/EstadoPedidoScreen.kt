package com.example.smokeygrillwear.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.wear.compose.material.ScalingLazyColumn

@Composable
fun EstadoPedidoScreen(navController: NavHostController) {
    val pedido = "#0001"
    val estado = "En preparación"

    ScalingLazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(16.dp)
    ) {
        // Ícono decorativo
        item {
            Text(
                text = "🔥",
                fontSize = 36.sp,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }

        // Número de pedido
        item {
            Text(
                text = "Pedido $pedido",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
            )
        }
// Estado en burbuja naranja
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.85f) // ✅ Limita el ancho total
                    .background(Color(0xFFFF6D00), shape = RoundedCornerShape(16.dp))
                    .padding(horizontal = 12.dp, vertical = 12.dp)
                    .shadow(2.dp, RoundedCornerShape(16.dp))
            ) {
                Text(
                    text = "Tu pedido está\n$estado",
                    fontSize = 15.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }


        // Espaciado
        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        // Botón estilo original (naranja redondeado)
        item {
            Button(
                onClick = {
                    navController.navigate("refrescar")

                },
                modifier = Modifier
                    .width(120.dp)
                    .height(36.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF6D00),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(50)
            ) {
                Text("Actualizar", fontSize = 13.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewEstadoPedidoScreen() {
    EstadoPedidoScreen(navController = rememberNavController())
}


