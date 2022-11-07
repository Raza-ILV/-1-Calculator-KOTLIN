package com.example.countingsuperapp

import android.content.Intent
import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    fun Clear() {
        val T = findViewById<TextView>(R.id.textView).apply {text = "0"}
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Clear()
        val countString = intent.getStringExtra("M_TO_PUSH")
        val T = findViewById<TextView>(R.id.textView).apply {text = countString}
    }
}