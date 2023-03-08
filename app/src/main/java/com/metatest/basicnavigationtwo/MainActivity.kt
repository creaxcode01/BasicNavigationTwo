package com.metatest.basicnavigationtwo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MyNavigationn()
                   }
    }
}

@Composable
fun MyNavigationn(){


    val RNavController = rememberNavController() // To save the state

    NavHost(navController = RNavController, startDestination = Dashboard.route) {
        composable(Dashboard.route) {
              DashboardScreen(RNavController)

        }

        composable(Detail.route) {
            DetailScreen()
        }



    } // end of NavHost body



}


