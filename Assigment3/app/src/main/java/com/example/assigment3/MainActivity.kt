package com.example.assigment3

import android.os.Bundle
import android.util.Log
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_add.setOnClickListener { onClicked() }
    }

    fun onClicked() {
        val code_version = input_code_name.text.toString()
        val version = input_android_version.text.toString()


        if(version == "" || code_version == "") {
            Toast.makeText(this, "Both inputs are required", Toast.LENGTH_LONG)
            Log.i("INFOTAG", "Both inputs are required")
            return
        }
        Toast.makeText(this, "Success", Toast.LENGTH_LONG)


        val tRow = TableRow(this)
        val layoutP = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tRow.layoutParams = layoutP

        val versionText = TextView(this)
        versionText.text = version
        val codeText = TextView(this)
        codeText.text = code_version

        tRow.addView(versionText, 0)
        Log.i("INFOTAG", "Success")
        tRow.addView(codeText, 1)
        input_version_table.addView(tRow)

        input_android_version.text.clear()
        input_code_name.text.clear()
    }
}