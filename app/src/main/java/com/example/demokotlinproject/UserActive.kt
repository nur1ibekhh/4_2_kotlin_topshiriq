package com.example.demokotlinproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserActive: AppCompatActivity() {
    var TAG = UserActive::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.active_layout)
        intView()
    }
    fun intView(){
        var active_menu_layot = findViewById<TextView>(R.id.active_menu_layot)
        var user = intent.getSerializableExtra("user")
        Log.d(TAG,user.toString())
        active_menu_layot.text = user.toString()
    }
}