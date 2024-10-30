package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Tạo danh sách email mẫu
    val emails = listOf(
        Email("Hust", "Hello world", "This is a snippet of email content...", "19:03 PM", true),
        Email("Random website abc", "Hi Kien Duong", "This is a snippet of the content...", "17:30 PM", true),
        Email("facebook.com", "Good day to you Duong Trung Kien", "Here is more email content...", "03:04 AM", true),
        Email("youtube", "Hello", "Snippet of email...", "03:45 AM", false),
        Email("threads", "Hey", "Lo and behold another snippet...", "13:18 PM", true)
    )

        val adapter = EmailAdapter(emails)
        recyclerView.adapter = adapter
    }
}
