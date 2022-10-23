package com.example.assigment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var menuList: ArrayList<String> = arrayListOf<String>("Hamburger","Pizza","Mexican","American","Chinese");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    @SuppressLint("SuspiciousIndentation")
    fun addFood(view: View) {

      var input =  inputMenu.text.toString();
        menuList.add(input);
      inputMenu.text.clear();
    }

    fun radomFood(view: View){

        tMenu.text = menuList.random();

    }
}