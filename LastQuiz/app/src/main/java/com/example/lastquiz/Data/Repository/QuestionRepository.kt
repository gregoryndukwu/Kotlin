package com.example.quizzie.Data.Repository

import androidx.lifecycle.LiveData
import com.example.quizzie.Data.DAOs.QuestionDao
import com.example.quizzie.Data.QuestionItem

class QuestionRepository(private val questionDao: QuestionDao) {

    val readAllData: LiveData<List<QuestionItem>> = questionDao.readAllData()

    suspend fun addQuestion(question: QuestionItem) {
        questionDao.addQuestion(question)
    }
}