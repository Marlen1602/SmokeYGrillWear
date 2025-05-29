# ⌚ Smoke y Grill – App para Wear OS

**Smoke y Grill** es una aplicación diseñada para smartwatches con sistema operativo **Wear OS**, cuyo propósito es facilitar el seguimiento de pedidos realizados en el restaurante. Está pensada para brindar una experiencia rápida, visual y accesible desde la muñeca del usuario.

## 📱 Funcionalidades

- Pantalla de bienvenida con branding del restaurante.
- Ingreso del número de pedido.
- Visualización del estado actual del pedido.
- Opción para refrescar la información del pedido.

## 🧩 Tecnologías y Herramientas

- Kotlin + Jetpack Compose para Wear OS
- Android Studio Electric Eel o superior
- Navegación con Navigation Compose
- Material Design for Wear OS
- Emuladores oficiales de Wear OS
- Figma + Plugin **Wear OS UI Kit** (para wireframes)

## 📐 Diseño Responsivo

El diseño fue adaptado a múltiples tamaños y formas de pantalla utilizando:

- Unidades relativas: `dp`, `sp`
- Composables como `ScalingLazyColumn`, `BoxWithConstraints`, etc.
- Pruebas en diferentes resoluciones: `320x320`, `454x454`
- Uso de `@Preview` con `WearDevices.SMALL_ROUND` y `WearDevices.LARGE_ROUND`

## 🖼️ Wireframes

Los mockups fueron diseñados previamente en **Figma**, siguiendo las recomendaciones de diseño de Google para Wear OS. Se respetó el uso de tipografía legible, colores contrastantes (negro y naranja) y una navegación clara en 1 solo nivel.

## 🧪 Dispositivos probados

- ✅ Wear OS Small Round (320x320)
- ✅ Wear OS Large Round (454x454)

Todas las pantallas fueron probadas en estos emuladores para asegurar visibilidad completa y correcta disposición de los elementos.

## 🚀 Instalación y ejecución

1. Clona este repositorio:
   ```bash
   git clone https://github.com/usuario/smoke-y-grill-wearos.git
