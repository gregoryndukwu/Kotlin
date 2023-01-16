package com.example.quizzie.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizzie.Composables.Button
import com.example.quizzie.Composables.RoundedButton


@Composable
fun HomeScreen(navController: NavController) {
    Column(verticalArrangement = Arrangement.Center, modifier = Modifier
        .fillMaxSize()
        .padding(vertical = 34.dp, horizontal = 18.dp)) {
        Row(modifier = Modifier.fillMaxWidth(),  horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            Button(text = "Start Quiz", color = Color.Black, onClickAction = {navController.navigate(Screen.Quiz.route)})
        }
    }
}