package com.example.gregoryquiz.Composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gregoryquiz.Models.QuestionItem


@Composable
fun RadioButtonQuestion(question: QuestionItem) {
    val radioOptions = question.answerOptions
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(0) }

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
                    selected = (answer.id == selectedOption),
                    onClick = { onOptionSelected(answer.id) }
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