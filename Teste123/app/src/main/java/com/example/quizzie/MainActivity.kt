package com.example.quizzie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.quizzie.Screens.SetupNavGraph
import com.example.quizzie.ui.theme.QuizzieTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizzieTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}