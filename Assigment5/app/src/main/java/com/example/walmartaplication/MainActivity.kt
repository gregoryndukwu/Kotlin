package com.example.walmartaplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var users = ArrayList(arrayListOf(
        User("Gregory", "Ndukwu", "gregory@gmail.com", "gregory123"),
        User("Santos", "Marco", "Santos@gmail.com", "123456"),
        User("Rand", "George", "ransolf@gmail.com", "randf123"),
        User("Liza", "Johnson", "liza@gmail.com", "liza123"),
        User("Emilly", "Blunt", "emilly@gmail.com", "emilly123"),
    ))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignIn.setOnClickListener{
            var email = inputEmail.text.toString()
            var password = inputPassword.text.toString()

            for (user in users) {
                if(email == user.email && password == user.passcode){
                    var intent = Intent(this,HomeActivity::class.java)
                    intent.putExtra("Email",user.email)
                    startActivity(intent)
                }
            }

        }

        var result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if(it.resultCode == Activity.RESULT_OK) {
                var user = it.data?.getSerializableExtra("user") as? User

                users.add(user);
                Toast.makeText(this, "Account created with Success", Toast.LENGTH_LONG).show()
            } else {
                Log.i("signup", "Error getting account data")
            }
        }

        btnCreate.setOnClickListener {
            var intent = Intent(this, FormActivity::class.java)
            result.launch(intent)
        }

    }
}