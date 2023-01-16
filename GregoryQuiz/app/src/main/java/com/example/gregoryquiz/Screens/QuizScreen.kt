package com.example.gregoryquiz.Screens

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
import com.example.gregoryquiz.Composables.RadioButtonQuestion
import com.example.gregoryquiz.Composables.RoundedButton
import com.example.gregoryquiz.Models.Answer
import com.example.gregoryquiz.Models.QuestionItem
import com.example.gregoryquiz.ui.theme.GregoryQuizTheme

val questions = listOf<QuestionItem>(
    QuestionItem(
        "What is the correct way to initialize a nullable variable?",
        listOf(
            Answer(1, "val name = null"),
            Answer(2, "var name: String"),
            Answer(3, "val name: String"),
            Answer(4, "val name: String? = null"),
        ),
        4
    ),
    QuestionItem(
        "Kotlin interfaces ad abstract classes are very similar. What is one thing abstract class can do that interfaces cannot?",
        listOf(
            Answer(1, "Only abstract classes are inheritable by subclasses"),
            Answer(2, "Only abstract classes can inherit from multiple superclasses"),
            Answer(3, "Only abstract classes can have abstract methods"),
            Answer(4, "Only abstract classes can store state reference"),
        ),
        4
    ),
    QuestionItem(
        "Your code need to try casting an object. If the cast is not possible, you do not want an exception generated, instead you want null to be assigned. Which operator can safely cast a value?",
        listOf(
            Answer(1, "as? (reference)"),
            Answer(2, "??"),
            Answer(3, "is"),
            Answer(4, "as"),
        ),
        1
    ),
)

@Composable
fun QuizScreen() {
    var index by remember { mutableStateOf(0) }
    var currentQuestion by remember { mutableStateOf(questions[index]) }
    Column(verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier
        .fillMaxSize()
        .padding(vertical = 24.dp, horizontal = 8.dp)) {
        RadioButtonQuestion(currentQuestion)

        Row(modifier = Modifier.fillMaxWidth(),  horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically) {
            RoundedButton(Color.Red, Icons.Default.Close, Color.Red, onClickAction = {currentQuestion = questions[--index]})
            RoundedButton(Color.Blue, Icons.Default.Home, Color.Blue, size = 60.dp, onClickAction = {currentQuestion = questions[--index]})
            RoundedButton(Color.Green, Icons.Default.Check, Color.Green, onClickAction = {currentQuestion = questions[++index]})
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuizScreenPreview() {
    GregoryQuizTheme() {
        QuizScreen()
    }
}