package com.example.walmartaplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    var clothes = ArrayList(arrayListOf(
        Product("Shirt",15.15,"black","Tommy",R.drawable.shirt01),
        Product("Shirt",25.15,"Green","Lacoste",R.drawable.shirt02),
        Product("Shirt",15.15,"black","Nike",R.drawable.shirt03),
        Product("Pants",19.15,"Orange","Nike",R.drawable.pants01),
        Product("Jacket",55.15,"black","Nike",R.drawable.jacket01)
    ))

    var food = ArrayList(arrayListOf(
        Product("Rice",5.15,"white","Jasmine",R.drawable.rice01),
        Product("Beans",4.15,"brown","Great Value",R.drawable.beans01),
        Product("Pasta",1.15,"white","Penne",R.drawable.pasta),
        Product("Pop",9.15,"black","Pepsi",R.drawable.pepsi),
        Product("Meat",35.15,"red","Top Sirloin",R.drawable.picanha01)
    ))

    var beaty = ArrayList(arrayListOf(
        Product("Beuty01",15.15,"black","Tommy",R.drawable.beauty01),
        Product("Beuty02",25.15,"Green","Lacoste",R.drawable.beauty02),
        Product("Beuty03",15.15,"black","Nike",R.drawable.beauty03),
        Product("Beuty04",19.15,"Orange","Nike",R.drawable.beauty04),
        Product("Beuty05",55.15,"black","Nike",R.drawable.beauty05)
    ))

    var eletronic = ArrayList(arrayListOf(
        Product("TV",15.15,"black","Tommy",R.drawable.tv01),
        Product("Nintendo",25.15,"Green","Lacoste",R.drawable.nintendo),
        Product("PS5",15.15,"black","Nike",R.drawable.ps5),
        Product("Xbox",19.15,"Orange","Nike",R.drawable.xbox),
        Product("Stadia",55.15,"black","Nike",R.drawable.google_stadia)
    ))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val profilemail = intent.getStringExtra("Email");
        welcomeId.text = "Welcome $profilemail"

        var intentLista = Intent(this,ProductActivity::class.java)

        imageView6.setOnClickListener{
            var intentDetail = Intent(this,DetailActivity::class.java)
            startActivity(intentDetail)
        }

        imageView2.setOnClickListener{
            intentLista.putExtra("products", food)
            startActivity(intentLista)
        }

        imageView3.setOnClickListener{
            intentLista.putExtra("products", beaty)
            startActivity(intentLista)
        }

        imageView4.setOnClickListener{
            intentLista.putExtra("products", clothes)
            startActivity(intentLista)
        }


    }
}