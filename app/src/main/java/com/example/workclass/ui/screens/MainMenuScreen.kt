package com.example.workclass.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun MainMenuScreens (navController:NavHostController) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
    )
    {
        Text("Home Screens")
        Button(
            onClick = { navController.navigate("Home_Screens") }
        ) {
            Text("Go to Home Screens")
        }


        Text("Test Screen")
        Button(
            onClick = { navController.navigate("TestScreen") }
        ) {
            Text("Go to Test Screen" )
        }

        Text("ScreenNissan")
        Button(
            onClick = { navController.navigate("ScreenNissan") }
        ) {
            Text("Go to ScreenNissan" )
        }

    }
}