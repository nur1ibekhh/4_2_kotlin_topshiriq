package com.example.demokotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intView();
    }

    fun intView(){
        val active_menu_layot = findViewById<Button>(R.id.menu_layout)
        active_menu_layot.setOnClickListener {
            var user = User(age = 20, name = "Nurlibek")
         openUserActive(user)
        }
    }
    fun openUserActive(user:User){
        val intent = Intent(this,UserActive::class.java)
        intent.putExtra("userAccount",user)
        startActivity(intent)
    }
}