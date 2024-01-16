package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Page3 : AppCompatActivity() {

    private lateinit var backBtnTwo: Button
    private lateinit var forwardBtnTwo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)


        backBtnTwo = findViewById(R.id.btnBackPgTwo)
        forwardBtnTwo = findViewById(R.id.btnForwardPgTwo)

    }

    fun backButtonTwo(view: View) {
        val clickme12 = Intent(this@Page3, page2::class.java)
        startActivity(clickme12)
    }

    fun forwardButtonTwo(view: View) {
        val clickme22 = Intent(this@Page3, Page3::class.java)
        startActivity(clickme22)
    }

}