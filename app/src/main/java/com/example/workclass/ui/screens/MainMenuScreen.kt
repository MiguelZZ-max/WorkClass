package com.example.workclass.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController


@Composable
fun MainMenuScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
    ) {
        Text("Main Menu")
        Button(
            onClick = { navController.navigate("Home_Screen") }
        ) {
            Text("Go to Home Screen")
        }
        Button(
            onClick = { navController.navigate("TestScreen") }
        ) {
            Text("Go to Test Screen")
        }
        Button(
            onClick = {
                navController.navigate("ComponentsScreen")

            }
        ) {
            Text("Go to Components Screen")
        }

        Button(
            onClick = { navController.navigate("ScreenNissan") }
        ) {
            Text("Go to ScreenNissan" )
        }
    }
}