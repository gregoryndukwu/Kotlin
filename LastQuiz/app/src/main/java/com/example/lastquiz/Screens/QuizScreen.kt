package com.example.quizzie.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lastquiz.Helpers.QuizzieDatabaseHelper
import com.example.quizzie.Composables.RadioButtonQuestion
import com.example.quizzie.Composables.RoundedButton


@Composable
fun QuizScreen(navController: NavController) {
    var index by remember { mutableStateOf(0) }
    var currentQuestion by remember { mutableStateOf(QuizzieDatabaseHelper.questions[index]) }

    fun handleNext() {
        if(index < QuizzieDatabaseHelper.questions.size - 1) {
            val i = ++index
            currentQuestion = QuizzieDatabaseHelper.questions[i]
        } else {
            currentQuestion = QuizzieDatabaseHelper.questions[0]
            navController.navigate(Screen.Result.route)
        }
    }

    Column(verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxSize().padding(vertical = 24.dp, horizontal = 8.dp)) {
        RadioButtonQuestion(currentQuestion)

        Row(modifier = Modifier.fillMaxWidth(),  horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically) {
            RoundedButton(Color.Cyan, Icons.Default.Close, Color.Red, onClickAction = {currentQuestion = QuizzieDatabaseHelper.questions[++index]})
            RoundedButton(Color.DarkGray, Icons.Default.Home, Color.Blue, size = 60.dp, onClickAction = {navController.navigate(Screen.Home.route)})
            RoundedButton(Color.Green, Icons.Default.Check, Color.Green, onClickAction = { handleNext() })
        }
    }
}