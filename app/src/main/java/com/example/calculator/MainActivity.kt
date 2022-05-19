package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvResult: TextView
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var btnAddition: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvResult = findViewById(R.id.tvResult)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        btnAddition = findViewById(R.id.btnAddition)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)


        btnAddition.setOnClickListener {
            var num1 = etNumber1.text.toString()
            var num2=etNumber2.text.toString()
            addition(num1.toInt(), num2.toInt())
        }
        btnSubtract.setOnClickListener {
            var num1 = etNumber1.text.toString()
            var num2=etNumber2.text.toString()
            subtraction(num1.toInt(), num2.toInt())
        }
        btnMultiply.setOnClickListener {
            var num1 = etNumber1.text.toString()
            var num2=etNumber2.text.toString()
            multiplication(num1.toInt(), num2.toInt())
        }
        btnModulus.setOnClickListener {
            var num1 = etNumber1.text.toString()
            var num2=etNumber2.text.toString()
            modulus(num1.toInt(), num2.toInt())
        }


    }

     fun addition(num1: Int, num2: Int) {
         var addition = num1 + num2
         tvResult.text = addition.toString()

    }
    fun subtraction(num1:Int,num2:Int){
        var subtraction = num1 - num2
        tvResult.text = subtraction.toString()
    }
    fun multiplication(num1:Int,num2:Int){
        var multiplication = num1 * num2
        tvResult.text = multiplication.toString()
    }
    fun modulus(num1:Int,num2:Int){
        var modulus= num1 % num2
        tvResult.text = modulus.toString()
    }




}