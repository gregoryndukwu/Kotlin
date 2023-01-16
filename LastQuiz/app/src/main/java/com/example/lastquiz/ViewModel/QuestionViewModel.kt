package com.example.lastquiz.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.quizzie.Data.QuestionItem
import com.example.quizzie.Data.QuizzieDatabase
import com.example.quizzie.Data.Repository.QuestionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuestionViewModel(application: Application): AndroidViewModel(application) {
    private val readAllData: LiveData<List<QuestionItem>>
    private val repository: QuestionRepository

    init {
        val questionDao = QuizzieDatabase.getDatabase(application).questionDao()
        repository = QuestionRepository(questionDao)
        readAllData = repository.readAllData
    }

    fun addQuestion(question: QuestionItem) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addQuestion(question)
        }
    }
}