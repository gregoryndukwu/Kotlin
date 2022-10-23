package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var MenuList: ArrayList<String> = arrayListOf<String>("Hamburger","Pizza","Mexican","American","Chinese");


    }

    fun add_food(view: View) {




    }
}