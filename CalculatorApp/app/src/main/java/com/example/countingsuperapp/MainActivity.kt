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
    //For prev value
    var capacitorOne = 0.0f
    //For operation catch
    var capacitorTwo=""
    //For second value
    var capacitorThree = 0.0f

    fun ADD(){
        val T = findViewById<EditText>(R.id.editTextNumber)
        val countString = T.text.toString()
        val valTMP: Float = countString.toFloat()
        capacitorOne = valTMP
        capacitorTwo = "ADD"
        T.setText("")
    }
    fun SUBTRACT(){
        val T = findViewById<EditText>(R.id.editTextNumber)
        val countString = T.text.toString()
        val valTMP: Float = countString.toFloat()
        capacitorOne = valTMP
        capacitorTwo = "SUBTRACT"
        T.setText("")
    }
    fun DIVIDE(){
        val T = findViewById<EditText>(R.id.editTextNumber)
        val countString = T.text.toString()
        val valTMP: Float = countString.toFloat()
        capacitorOne = valTMP
        capacitorTwo = "DIVIDE"
        T.setText("")
    }
    fun MULTIPLY(){
        val T = findViewById<EditText>(R.id.editTextNumber)
        val countString = T.text.toString()
        val valTMP: Float = countString.toFloat()
        capacitorOne = valTMP
        capacitorTwo = "MULTIPLY"
        T.setText("")
    }
    fun Clear(){
        val T = findViewById<EditText>(R.id.editTextNumber)
        capacitorOne = 0.0f
        capacitorTwo = "NONE"
        T.setText("")
    }
    fun SwapPage(view: View){
        val T = findViewById<EditText>(R.id.editTextNumber)
        val countString = T.text.toString()
        val valTMP: Float = countString.toFloat()
        if(capacitorTwo=="ADD"){capacitorThree = (capacitorOne + valTMP)}
        if(capacitorTwo=="SUBTRACT"){capacitorThree = (capacitorOne - valTMP)}
        if(capacitorTwo=="DIVIDE"){capacitorThree = (capacitorOne / valTMP)}
        if(capacitorTwo=="MULTIPLY"){capacitorThree = (capacitorOne * valTMP)}
        Intent(this, SecondActivity::class.java).also {
            it.putExtra("M_TO_PUSH", capacitorThree.toString())
            startActivity(it)
        }
        T.setText("")
    }
}
