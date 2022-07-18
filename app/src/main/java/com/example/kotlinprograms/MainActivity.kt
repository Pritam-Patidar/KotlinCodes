package com.example.kotlinprograms

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

           btn1.setOnClickListener{
               updateCounter()
           }
//        Log.d(TAG, "${Thread.currentThread().name}")

    }

    private fun updateCounter() {
        textView.text = "${textView.text.toString().toInt() +1}"

//        cheaking thread name using Log.d() statment of current task....
        Log.d(TAG, "${Thread.currentThread().name}")

    //        textView.text = "${textView.text.toString().toInt() +1}"

    }

}

