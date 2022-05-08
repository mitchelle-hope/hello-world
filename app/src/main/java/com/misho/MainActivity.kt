package com.misho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnbmi:Button
    lateinit var btnmoney : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnbmi = findViewById(R.id.btnbmi)
        btnmoney = findViewById(R.id.btnmoney)
        btnbmi.setOnClickListener() {
         val intent = Intent(this,bmicalculatoractivity::class.java)
            startActivity(intent)
        }

        btnmoney.setOnClickListener {
            val intent = Intent(this, SendMoney::class.java)
            startActivity(intent)
        }
    }
}