package com.example.weatherforecast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // declarations

    val welcomeText = findViewById<TextView>(R.id.welcomeText)
    val studentName = findViewById<TextView>(R.id.studentName)
    val studentNumber = findViewById<TextView>(R.id.studentNumber)
    val startButton = findViewById<Button>(R.id.startButton)
    val exitButton = findViewById<Button>(R.id.exitButton)

    startButton.setOnclickListener {
        // create explicit intent
        val intent = Intent(this, Second_Screen::class.java)

    }



}