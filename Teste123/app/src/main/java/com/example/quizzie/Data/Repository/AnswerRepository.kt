package com.example.quizzie.Data.Repository

import androidx.lifecycle.LiveData
import com.example.quizzie.Data.Answer
import com.example.quizzie.Data.DAOs.AnswerDao

class AnswerRepository(private val answerDao: AnswerDao) {

    val readAllData: LiveData<List<Answer>> = answerDao.readAllData()

    suspend fun addAnswer(answer: Answer) {
        answerDao.addAnswer(answer)
    }
}