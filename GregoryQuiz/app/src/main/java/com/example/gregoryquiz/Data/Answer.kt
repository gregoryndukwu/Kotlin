package com.example.gregoryquiz.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "answer_table")
data class Answer(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val text: String
)