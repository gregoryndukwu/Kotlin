package com.example.quizzie.Composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lastquiz.Models.QuestionItem


@Composable
fun RadioButtonQuestion(question: QuestionItem) {
    val radioOptions = question.answerOptions
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(0) }

    fun handleAnswer(id: Int) {
        onOptionSelected(id)
        question.handleAnswer(id)
    }

    Column {
        Text(
            text = question.question,
            style = MaterialTheme.typography.bodyMedium.merge(),
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        radioOptions.forEach { answer ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = (answer.id == selectedOption),
                        onClick = {
                            onOptionSelected(answer.id)
                        }
                    )
                    .padding(horizontal = 16.dp)
            ) {

                RadioButton(
                    selected = (answer.id == selectedOption && question.selectedOptionId == selectedOption),
                    onClick = { handleAnswer(answer.id) }
                )
                Text(
                    text = answer.text,
                    style = MaterialTheme.typography.bodySmall.merge(),
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
    }
}