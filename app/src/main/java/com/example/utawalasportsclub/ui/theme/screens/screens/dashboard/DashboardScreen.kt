package com.example.utawalasportsclub.ui.theme.screens.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun AboutScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxHeight().fillMaxWidth()
        .background(color = Color(android.graphics.Color.GRAY)),
        horizontalAlignment = Alignment.CenterHorizontally



    ){


    }








}

@Composable
@Preview(showBackground = true)
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())

}