package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "sweater"),
        Category("HOODIES", "sweater"),
        Category("HATS", "sweater"),
        Category("DIGITAL", "sweater")
    )

    val hats = listOf(
        Product("Sweater0", "$18", "sweater"),
        Product("Sweater1", "$19", "sweater"),
        Product("Sweater2", "$17", "sweater"),
        Product("Sweater3", "$16", "sweater")
    )

    val hoodies = listOf(
        Product("Sweater4", "$12", "sweater"),
        Product("Sweater5", "$13", "sweater"),
        Product("Sweater6", "$14", "sweater"),
        Product("Sweater7", "$18", "sweater")
    )

    val shirts = listOf(
        Product("Sweater8", "$12", "sweater"),
        Product("Sweater9", "$13", "sweater"),
        Product("Sweater10", "$14", "sweater"),
        Product("Sweater11", "$18", "sweater")
    )
}