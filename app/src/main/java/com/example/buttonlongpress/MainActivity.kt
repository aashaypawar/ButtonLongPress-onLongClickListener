package com.example.buttonlongpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mBtn = findViewById<Button>(R.id.btn)
        mBtn.setOnLongClickListener{
            Toast.makeText(applicationContext,"Button Long Pressed", Toast.LENGTH_SHORT).show()
            true
        }
    }
}