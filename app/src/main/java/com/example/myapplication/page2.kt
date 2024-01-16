package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class page2 : AppCompatActivity() {

    private lateinit var backBtnOne: Button
    private lateinit var forwardBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        backBtnOne = findViewById(R.id.btnBackPgOne)
        forwardBtn = findViewById(R.id.btnForwardPgOne)
    }

    fun backButtonOne(view: View) {
        val clickme1 = Intent(this@page2, MainActivity::class.java)
        startActivity(clickme1)
    }

    fun forwardButtonOne(view: View) {
        val clickme2 = Intent(this@page2, Page3::class.java)
        startActivity(clickme2)
    }

}