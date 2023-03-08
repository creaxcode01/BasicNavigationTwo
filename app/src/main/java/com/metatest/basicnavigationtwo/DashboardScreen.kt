package com.metatest.basicnavigationtwo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun DashboardScreen(RNavController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
          )
    {
        
        Text(text = "Dashboard Screen",
        fontSize = 48.sp
            )

        Button(onClick = {RNavController.navigate(Detail.route)})
        
        {
            Text(text = "Next")
        }
        
    }
    

    
}