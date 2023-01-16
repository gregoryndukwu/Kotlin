package com.example.gregoryquiz.Data.DAOs

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.gregoryquiz.Data.Answer


@Dao
interface AnswerDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addAnswer(answer: Answer)

    @Query("SELECT * FROM answer_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<Answer>>
}