package com.misho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bmicalculatoractivity : AppCompatActivity() {
    lateinit var btnSendmoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalculatoractivity)
        btnSendmoney = findViewById(R.id.btnSendmoney)
        btnSendmoney.setOnClickListener {
            val intent = Intent(this,bmicalculatoractivity::class.java)
            startActivity(intent)
        }
}


    }