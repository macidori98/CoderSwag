package com.example.coderswag.controller

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.ProductsRecyclerViewAdapter
import com.example.coderswag.services.DataService
import kotlinx.android.synthetic.main.acitivity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductsRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_products)

        adapter = ProductsRecyclerViewAdapter(this, DataService.hats) { category ->
            Toast.makeText(this, category.title, Toast.LENGTH_SHORT).show()
        }
        productsListView.layoutManager = LinearLayoutManager(this)
        productsListView.adapter = adapter
    }
}