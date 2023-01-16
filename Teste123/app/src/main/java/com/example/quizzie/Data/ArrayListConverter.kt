package com.example.quizzie.Data

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

inline fun <reified T> Gson.fromJson(json: String) =
    fromJson<T>(json, object : TypeToken<T>() {}.type)

class ArrayListConverter {
    @TypeConverter
    fun fromAnswerList(value: List<Answer>): String {
        return Gson().toJson(value)
    }

    @TypeConverter
    fun toAnswerList(value: Answer): List<Answer> {
        return try {
            Gson().fromJson<List<Answer>>(value.toString())
        } catch (e: Exception) {
            arrayListOf()
        }
    }
}