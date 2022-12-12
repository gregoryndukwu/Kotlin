package com.example.cvbuilder.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cvbuilder.MainActivity
import com.example.cvbuilder.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_logout?.setOnClickListener{
            val sharedPreference =  this.requireContext().getSharedPreferences("USER_DATA", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.remove("email")
            editor.remove("password")
            editor.apply()
            val intent = Intent(
                this.requireContext(),
                MainActivity::class.java
            )
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}

