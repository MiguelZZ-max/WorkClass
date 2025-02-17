package com.example.workclass.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.workclass.R

@Composable
fun HomeScreens(navController: NavHostController) {
    topbar()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp,60.dp,0.dp,0.dp)
            .verticalScroll(rememberScrollState())

    ) {
        Content1()
        Content2()
    }
}
@Composable
fun Content1(){
    Card(
        modifier = Modifier.background(Color.Magenta)
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Text(text = "This is a title",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(10.dp)
        )
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            painter = painterResource(R.drawable.o),
            contentDescription = "o",
            contentScale = ContentScale.Crop
        )
        Text(
            stringResource(R.string.text_cine),
            textAlign = TextAlign.Justify,
            lineHeight = 18.sp,
            modifier = Modifier.padding(10.dp)
        )
    }
}

@Composable
fun Content2(){
    Card(
        modifier = Modifier.background(Color.Magenta)
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Row (

        ){
            Image(
                modifier = Modifier
                    .width(80.dp)
                    .height(100.dp),
                painter = painterResource(R.drawable.o),
                contentDescription = "matrix",
                contentScale = ContentScale.Crop
            )
            Column (

            ){
                Text (text = "This is a title",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(5.dp)
                )
                Text(
                    stringResource(R.string.text_cine),
                    textAlign = TextAlign.Justify,
                    lineHeight = 14.sp,
                    fontSize = 10.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }
}

@Composable
fun topbar(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color.Black)
            .padding(10.dp)
    ){
        Icon(
            Icons.Filled.Menu,
            contentDescription = "Menu Icon",
            tint = Color.White,
            modifier = Modifier
                .size(50.dp)
        )
        Text(
            stringResource(R.string.app_name),
            color = Color.White,
            fontSize = 30.sp,

        )
    }
}