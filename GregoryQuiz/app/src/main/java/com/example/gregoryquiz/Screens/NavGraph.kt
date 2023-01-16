package com.example.gregoryquiz.Screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Quiz.route
    ){
        composable(
            route = Screen.Quiz.route
        ) {
            QuizScreen()
        }
    }
}