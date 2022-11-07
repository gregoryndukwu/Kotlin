package com.example.walmartaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var productsList: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        recyclerview = findViewById(R.id.products_recycler_view)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        productsList = arrayListOf<Product>()
        productsList = intent.getSerializableExtra("products") as ArrayList<Product>
        recyclerview.adapter = Adapter(productsList)
    }
}