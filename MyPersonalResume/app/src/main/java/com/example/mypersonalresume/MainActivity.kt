package com.example.mypersonalresume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mypersonalresume.Model.Users
import com.example.mypersonalresume.Model.Validators
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var mockedUser = Users("Gregory", "Ndukwu", "gregory@gmail.com", "1234567")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_btn.setOnClickListener {
            var email = input_username.text.toString()
            var password = input_password.text.toString()

            var loginResult = login(email, password)
            if(loginResult) {
                clearInputs()
                var intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("user", "")
                startActivity(intent)
            }
        }
    }

    private fun login(email: String?, password: String?): Boolean {
        if(email == "" || email == null || password == "" || password == null){
            Toast.makeText(this, "Both fields are required", Toast.LENGTH_LONG)
            return false
        }
        if(!Validators.isValidEmail(email)) {
            Toast.makeText(this, "E-mail format is invalid", Toast.LENGTH_LONG).show()
            return false
        }

        var returneduser = findUserByEmail(email)
        return if(returneduser?.password == password) {
            // SAVE USER TO SHARED PREFERENCES
            true
        } else {
            Toast.makeText(this, "Invalid user", Toast.LENGTH_LONG)
            false
        }

    }

    private fun findUserByEmail(email: String): Users? {
        // FIND USER IN THE DATABASE
        return mockedUser
    }

    private fun clearInputs() {
        input_username.text.clear()
        input_password.text.clear()
    }
}