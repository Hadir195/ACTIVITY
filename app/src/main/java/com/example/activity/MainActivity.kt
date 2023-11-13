package com.example.multiactivity_saeful

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.activity.Activity3
import com.example.activity.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>{ R.id.button}
        button.setOnClickListener {
            val Intent = Intent(  this, Activity3::class.java)
            startActivity(Intent)
        }

    }