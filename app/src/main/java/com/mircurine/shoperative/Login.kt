package com.mircurine.shoperative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class Login : AppCompatActivity() {

    private lateinit var tvForgotPassword: TextView
    private lateinit var buttonLogin: Button
    private lateinit var tvForSignup: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tvForgotPassword = findViewById(R.id.tv_forgot_password)
        tvForSignup = findViewById(R.id.tv_for_signup)
        buttonLogin = findViewById(R.id.button_login)

        tvForgotPassword.setOnClickListener {
            val intent = Intent(this, Forgot::class.java)
            startActivity(intent)
        }

        buttonLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        tvForSignup.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
    }
}
