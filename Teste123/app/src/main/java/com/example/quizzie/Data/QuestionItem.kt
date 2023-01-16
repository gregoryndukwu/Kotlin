package com.example.quizzie.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question_table")
data class QuestionItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var question: String,
  //  var answerOptions: List<Answer>,
    var corretAnswerId: Int,
)