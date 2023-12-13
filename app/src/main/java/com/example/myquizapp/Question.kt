package com.example.myquizapp

import android.graphics.Color
import android.widget.TextView

data class Question(
    val id:Int,
    val question:String,
    val image:Int,
    val optOne: String,
    val optTwo: String,
    val optThree: String,
    val optFour: String,
    val correctAns:Int
) {
    fun setTextColor(tv: TextView, question: String) {
        (Color.parseColor("#FFFFDD"))
    }
}


   