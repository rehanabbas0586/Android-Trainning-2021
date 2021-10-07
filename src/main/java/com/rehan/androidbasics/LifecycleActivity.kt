package com.rehan.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        Log.i("Rehan","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Rehan","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Rehan","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Rehan","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Rehan","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Rehan","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Rehan","onRestart")
    }
}