package com.rehan.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a= findViewById<TextView>(R.id.txVw)

        val b= findViewById<Button>(R.id.BtOk)
        a.setOnClickListener {
            a.text="Welcome to Android Programming"
        }
    }
}