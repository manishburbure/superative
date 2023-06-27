package com.mircurine.shoperative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {

    private lateinit var signUpButton: Button
    private lateinit var poweruserBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        signUpButton = findViewById(R.id.signupBtn)
        poweruserBtn = findViewById(R.id.poweruserBtn)

        signUpButton.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        poweruserBtn.setOnClickListener {
            val intent = Intent(this, Poweruser::class.java)
            startActivity(intent)
        }

    }
}
