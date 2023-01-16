package com.example.quizzie.Screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lastquiz.Helpers.QuizzieDatabaseHelper
import com.example.quizzie.Composables.Button


@Composable
fun ResultScreen(navController: NavController) {
    var totalCorrectAnswers = 0
    var totalWrongAnswers = 0

    QuizzieDatabaseHelper.questions.forEach{
        if (it.answerId == it.corretAnswerId) {
            ++totalCorrectAnswers;
        } else {
            ++totalWrongAnswers
        }
    }
    Column(verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxSize().padding(vertical = 24.dp, horizontal = 8.dp)) {
        Row(modifier = Modifier.fillMaxWidth(),  horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically) {
            Text("Your score $totalCorrectAnswers correct and $totalWrongAnswers wrong answers")
        }
        Row(modifier = Modifier.fillMaxWidth(),  horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically) {
            Button(text = "Restart Quiz", color = Color.Blue, onClickAction = {navController.navigate(Screen.Quiz.route)})
            Button(text = "Go to Home", color = Color.Blue, onClickAction = {navController.navigate(Screen.Home.route)})
        }
    }
}