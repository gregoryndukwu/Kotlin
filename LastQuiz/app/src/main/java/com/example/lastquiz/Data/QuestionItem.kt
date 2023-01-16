package com.example.quizzie.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question_table")
data class QuestionItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var question: String,
    var answerOption1: String,
    var answerOption2: String,
    var answerOption3: String,
    var answerOption4: String,
    var corretAnswer: String,
)