package com.example.deliveryfood

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.accueil)

        val  btn_signup = findViewById<Button>(R.id.signup_btn)
        btn_signup.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        val btn_login = findViewById<Button>(R.id.login_btn)
        btn_login.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }


        }


    }





