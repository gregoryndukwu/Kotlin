package com.example.walmartaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var product = Product("Italian Beans", 3.90, "N/A", "Beans Wounderfoul", R.drawable.beans01)
        img_product.setImageResource(product.image)
        txt_title.text = product.title
        txt_color.text = "Color: " + product.color
        txt_price.text = "Price: $" + product.price.toString()
        txt_description.text = product.description
    }
}