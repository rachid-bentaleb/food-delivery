package com.example.deliveryfood

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class signup : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val  btn_return = findViewById<Button>(R.id.returne)
        btn_return.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val  txtlogin = findViewById<TextView>(R.id.txtlogin)
        txtlogin.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }

}