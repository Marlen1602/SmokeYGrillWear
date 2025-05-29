package com.example.smokeygrillwear.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.smokeygrillwear.presentation.screens.*
import com.example.smokeygrillwear.presentation.theme.SmokeYGrillWearTheme // Asegúrate de importar tu tema

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        setContent {
            SmokeYGrillWearTheme { // <-- Aplica el tema personalizado
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "welcome") {
                    composable("welcome") { WelcomeScreen(navController) }
                    composable("input") { InputScreen(navController) }
                    composable("estado") { EstadoPedidoScreen(navController) }
                    composable("refrescar") { RefrescarScreen(navController) }
                }
            }
        }
    }
}
