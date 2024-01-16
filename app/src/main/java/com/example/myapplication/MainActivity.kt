package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var clickMeBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickMeBtn = findViewById(R.id.btnClickMe)
    }

    fun clickMeButton(view: View) {
        val clickme = Intent(this@MainActivity, page2::class.java)
        startActivity(clickme)
    }
}