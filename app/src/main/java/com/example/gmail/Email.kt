package com.example.gmail

data class Email(
    val sender: String,
    val subject: String,
    val snippet: String,
    val time: String,
    val isStarred: Boolean
)