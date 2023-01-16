package com.example.quizzie.Screens

sealed class Screen(val route: String) {
    object Quiz: Screen(route = "quiz_screen")
    object Result: Screen(route = "result_screen")
}
