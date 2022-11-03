package com.example.countingsuperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //VARIABLES
    var holder: Float = 0.0f
    var holder2=""
    var holder3: Float = 0.0f

    //VARIABLES
    fun Plus(view: View){
        val textView = findViewById<EditText>(R.id.editTextNumber)
        val countString = textView.text.toString()
        var intValue: Float = countString.toFloat()
        holder = intValue
        holder2 = "p"
        textView.setText("")
    }
    fun Minus(view: View){
        val textView = findViewById<EditText>(R.id.editTextNumber)
        val countString = textView.text.toString()
        var intValue: Float = countString.toFloat()
        holder = intValue
        holder2 = "s"
        textView.setText("")
    }
    fun Divide(view: View){
        val textView = findViewById<EditText>(R.id.editTextNumber)
        val countString = textView.text.toString()
        var intValue: Float = countString.toFloat()
        holder = intValue
        holder2 = "d"
        textView.setText("")
    }
    fun Multiply(view: View){
        val textView = findViewById<EditText>(R.id.editTextNumber)
        val countString = textView.text.toString()
        var intValue: Float = countString.toFloat()
        holder = intValue
        holder2 = "m"
        textView.setText("")
    }
    fun Clear(view: View){
        val textView = findViewById<EditText>(R.id.editTextNumber)
        val countString = textView.text.toString()
        var intValue: Float = countString.toFloat()
        holder = 0.0f
        holder2 = "none"
        textView.setText("")
    }
    fun SwapPage(view: View){
        val textView = findViewById<EditText>(R.id.editTextNumber)
        val countString = textView.text.toString()
        var intValue: Float = countString.toFloat()
        if(holder2=="p"){
            holder3 = (holder + intValue)
        }
        if(holder2=="s"){
            holder3 = (holder - intValue)
        }
        if(holder2=="d"){
            holder3 = (holder / intValue)
        }
        if(holder2=="m"){
            holder3 = (holder * intValue)
        }
        Intent(this, SecondActivity::class.java).also {
            it.putExtra("EXTRA_MESSAGE", holder3.toString())
            startActivity(it)
        }
        textView.setText("")
    }
}
