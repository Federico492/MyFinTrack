package com.example.fintrack

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvCategory = findViewById<RecyclerView>(R.id.rv_categories)
    }
}

private val tasks = listOf(
    CategoryEntity(
        "All"
    ),
    CategoryEntity(
        "Home"
    ),
    CategoryEntity(
        "Car"
    ),
    CategoryEntity(
        "Clothes"
    ),
    CategoryEntity(
        "Fun"
    ),
)