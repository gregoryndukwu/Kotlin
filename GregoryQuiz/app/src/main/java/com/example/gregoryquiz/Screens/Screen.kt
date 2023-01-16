package com.example.gregoryquiz.Screens

sealed class Screen(val route: String) {
    object Quiz: Screen(route = "quiz_screen")
    object Result: Screen(route = "result_screen")
}
