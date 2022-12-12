package com.example.cvbuilder

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cvbuilder.helpers.ValidEntry
import com.example.cvbuilder.models.User
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {
    val tempDatabase = ArrayList<User>(arrayListOf(
        User("gregory", "augusto", "gregory@gmail.com", "123456")
    ))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_login.setOnClickListener {
            var email = login_email.text.toString()
            var password = login_password.text.toString()

            var loginResult = runLogin(email, password)
            if(loginResult) {

                var intent = Intent(this, Home::class.java)

                startActivity(intent)
            }
        }
        val sharedPreference =  getSharedPreferences("USER_DATA", Context.MODE_PRIVATE)
        val emailShared = sharedPreference.getString("email", "")
        val passwordShared = sharedPreference.getString("password", "")
        if(emailShared != "" && passwordShared != "") {
            var loginResult = runLogin(emailShared, passwordShared)
            if(loginResult) {

                var intent = Intent(this, Home::class.java)

                startActivity(intent)
            }
        }

    }

    private fun runLogin(email: String?, password: String?): Boolean {
        if(email == "" || email == null || password == "" || password == null){
            Toast.makeText(applicationContext, "Both fields are required", Toast.LENGTH_LONG)
            return false
        }
        if(!ValidEntry.isValidEmail(email)) {
            Toast.makeText(applicationContext, "E-mail format is invalid", Toast.LENGTH_LONG)
            return false
        }

        var returneduser = findUserByEmail(email)
        return if(returneduser?.password == password) {
            val sharedPreference =  getSharedPreferences("USER_DATA", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            //editor.remove("email")
            editor.putString("email", email)
            editor.putString("password", password)
            editor.putString("username", returneduser.firstname + " " + returneduser.lastname)
            editor.apply()
            true
        } else {
            Toast.makeText(applicationContext, "Invalid user", Toast.LENGTH_LONG)
            false
        }

    }

    private fun findUserByEmail(email: String): User? {
        var user: User? = null
        tempDatabase.forEach {
            if(it.email == email) {
                user = it
            }
        }
        return user

    }


}
