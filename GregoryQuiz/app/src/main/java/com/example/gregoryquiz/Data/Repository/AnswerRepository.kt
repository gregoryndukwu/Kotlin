package com.example.gregoryquiz.Data.Repository

import androidx.lifecycle.LiveData
import com.example.gregoryquiz.Data.Answer
import com.example.gregoryquiz.Data.DAOs.AnswerDao


class AnswerRepository(private val answerDao: AnswerDao) {

    val readAllData: LiveData<List<Answer>> = answerDao.readAllData()

    suspend fun addAnswer(answer: Answer) {
        answerDao.addAnswer(answer)
    }
}