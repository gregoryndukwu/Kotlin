package com.example.cvbuilder.work

data class Work(var title: String, var description: String,
                var company: String, var client: String,
                var startDate: String, var endDate: String,
                var image: Int): java.io.Serializable