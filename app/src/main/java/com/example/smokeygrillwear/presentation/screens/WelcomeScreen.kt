package com.example.smokeygrillwear.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.smokeygrillwear.R
import androidx.compose.material3.Button // Or other specific mobile components you need
import androidx.compose.material3.ButtonDefaults // Or other specific mobile components you need
import androidx.wear.compose.material.Text // Explicitly import Text from Wear
import androidx.wear.compose.material.ScalingLazyColumn // And other Wear components


@Composable
fun WelcomeScreen(navController: NavHostController) {
    ScalingLazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(
            top = 8.dp,
            bottom = 24.dp,
            start = 12.dp,
            end = 12.dp
        )
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo Smoke y Grill",
                modifier = Modifier
                    .size(85.dp)
                    .padding(8.dp)
            )
        }

        item {
            Text(
                text = "Bienvenido a",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        item {
            Text(
                text = "Smoke & Grill",
                color = Color(0xFFFF6D00),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        item {
            Text(
                text = "Detalles de su pedido",
                color = Color.Black,
                fontSize = 12.sp,
                modifier = Modifier.padding(bottom = 12.dp)
            )
        }
        item {
            Button(
                onClick = { navController.navigate("input") },
                modifier = Modifier
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(horizontal = 4.dp)
                    .height(36.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF6D00),
                    contentColor = Color.White
                ),
                shape = MaterialTheme.shapes.small // esquinas menos redondas
            ) {
                Text("Ver", fontSize = 13.sp)
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWelcomeScreen() {
    WelcomeScreen(navController = rememberNavController())
}
