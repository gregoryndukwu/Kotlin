package com.example.walmartaplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        btn_create.setOnClickListener{
            val first = input_first.text.toString()
            val last  = input_last.text.toString()
            val email = input_email.text.toString()
            val passcode = input_password.text.toString()

            val user = User(first, last, email, passcode)
            var intent = intent
            intent.putExtra("user", user)
            setResult(Activity.RESULT_OK, intent)
            finish()


        }

    }
    override fun onBackPressed() {
        setResult(Activity.RESULT_CANCELED)
        finish()
    }
}