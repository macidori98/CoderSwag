package com.example.coderswag.controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.CategoryRecyclerViewAdapter
import com.example.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerViewAdapter(this, DataService.categories) { category ->
            val intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent)

        }
        categoriesListView.layoutManager = LinearLayoutManager(this)
        categoriesListView.adapter = adapter
    }
}