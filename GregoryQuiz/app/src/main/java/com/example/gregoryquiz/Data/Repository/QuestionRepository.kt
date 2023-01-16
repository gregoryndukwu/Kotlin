package com.example.gregoryquiz.Data.Repository

import androidx.lifecycle.LiveData
import com.example.gregoryquiz.Data.DAOs.QuestionDao
import com.example.gregoryquiz.Data.QuestionItem


class QuestionRepository(private val questionDao: QuestionDao) {

    val readAllData: LiveData<List<QuestionItem>> = questionDao.readAllData()

    suspend fun addQuestion(question: QuestionItem) {
        questionDao.addQuestion(question)
    }
}