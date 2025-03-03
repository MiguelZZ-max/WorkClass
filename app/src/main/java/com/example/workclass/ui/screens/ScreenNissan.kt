package com.example.workclass.ui.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.workclass.R

@Composable
fun ScreenNissan(navController: NavHostController) {
    topbar()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp)
            .verticalScroll(rememberScrollState())
    ) {
        CarControlScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun CarControlScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "VERSA GRIS OXFORD",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "Desplegable",
                    tint = Color.Black
                )
            }
            IconButton(onClick = { /* Acción del menú */ }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menú",
                    tint = Color.Black
                )
            }
        }

        Box(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.tu_imagen),
                contentDescription = "Fondo",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Image(
                painter = painterResource(id = R.drawable.car_image),
                contentDescription = "Imagen del auto",
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                ImageButton(iconRes = R.drawable.locate_icon, label = "Localízame")
                ImageButton(iconRes = R.drawable.movement_alert_icon, label = "Alerta de Movimiento")
                ImageButton(iconRes = R.drawable.horn_icon, label = "Bocina")
            }
            Divider(
                color = Color.Gray,
                modifier = Modifier
                    .width(1.dp)
                    .fillMaxHeight()
            )
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                ImageButton(iconRes = R.drawable.geofence_icon, label = "Geocercas")
                ImageButton(iconRes = R.drawable.speed_alert_icon, label = "Alerta de Velocidad")
                ImageButton(iconRes = R.drawable.navigation_icon, label = "Navegación")
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        BottomButtons() // Sección de botones inferiores dentro de un cuadro blanco
    }
}

@Composable
fun BottomButtons() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                AssistanceButton(iconRes = R.drawable.road_assistance_icon, label = "Asistencia Vial\n Nissan ")
                AssistanceButton(iconRes = R.drawable.nissan_connect_icon, label = "  Asistencia\n Nissan Connect\n Finder ")
                AssistanceButton(iconRes = R.drawable.schedule_icon, label = "  Agendar\n Revisión")
            }
        }
    }
}

@Composable
fun ImageButton(@DrawableRes iconRes: Int, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = label,
            modifier = Modifier.size(48.dp),
            tint = Color.Black
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = label, fontSize = 14.sp, fontWeight = FontWeight.Medium, color = Color.Blue)
    }
}

@Composable
fun AssistanceButton(@DrawableRes iconRes: Int, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = label,
            modifier = Modifier.size(32.dp),
            tint = Color.Black
        )
        Text(text = label, fontSize = 12.sp, color = Color.Blue)
    }
}
