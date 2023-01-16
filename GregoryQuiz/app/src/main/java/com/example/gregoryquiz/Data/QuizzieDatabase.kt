package com.example.gregoryquiz.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.gregoryquiz.Data.DAOs.AnswerDao
import com.example.gregoryquiz.Data.DAOs.QuestionDao


@Database(entities = [QuestionItem::class, Answer::class], version = 0, exportSchema = false)
abstract class QuizzieDatabase: RoomDatabase() {

    abstract fun questionDao(): QuestionDao

    abstract fun answerDao(): AnswerDao

    companion object {
        @Volatile
        private var INSTANCE: QuizzieDatabase? = null

        fun getDatabase(context: Context): QuizzieDatabase {
            val tempInstance = INSTANCE

            if(tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuizzieDatabase::class.java,
                    "quizzie_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}