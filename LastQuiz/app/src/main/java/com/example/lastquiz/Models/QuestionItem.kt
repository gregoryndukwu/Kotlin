package com.example.lastquiz.Models

class QuestionItem(var question: String, var answerOptions: List<Answer>, var corretAnswerId: Int, var answerId: Int, var selectedOptionId: Int = 0) {
    fun handleAnswer(id: Int) {
        this.answerId = id
        this.selectedOptionId = id
    }
}