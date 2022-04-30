package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number1 : Double?=null
    var number2 : Double?=null
    var rslt : Double?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sum(view : View)
    {
         number1 = firstNumber.text.toString().toDoubleOrNull()
         number2 = secondNumber.text.toString().toDoubleOrNull()

        if(number1== null || number2 ==null)
        {
            result.text="Lütfen Rakam Giriniz"
        }
        else{

            rslt=number1!!+number2!!
            result.text=rslt.toString()
        }
    }
    fun subtract(view : View)
    {
         number1 = firstNumber.text.toString().toDoubleOrNull()
        number2 = secondNumber.text.toString().toDoubleOrNull()

        if(number1== null || number2 ==null)
        {
            result.text="Lütfen Rakam Giriniz"
        }
        else{

            rslt=number1!!-number2!!
            result.text=rslt.toString()
        }
    }
    fun multiply(view : View)
    {
        number1 = firstNumber.text.toString().toDoubleOrNull()
        number2 = secondNumber.text.toString().toDoubleOrNull()

        if(number1== null || number2 ==null)
        {
            result.text="Lütfen Rakam Giriniz"
        }
        else{

            rslt=number1!!*number2!!
            result.text=rslt.toString()
        }
    }
    fun divide(view : View)
    {
        number1 = firstNumber.text.toString().toDoubleOrNull()
        number2 = secondNumber.text.toString().toDoubleOrNull()

        if(number1== null || number2 ==null)
        {
            result.text="Lütfen Rakam Giriniz"
        }
        else{

            rslt=number1!!/number2!!
            result.text=rslt.toString()
        }
    }
}