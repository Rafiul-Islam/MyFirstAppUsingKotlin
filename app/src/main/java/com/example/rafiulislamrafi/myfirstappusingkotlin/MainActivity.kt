package com.example.rafiulislamrafi.myfirstappusingkotlin

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById(R.id.text) as TextView

        textview.text = "Hello Kotlin !"
    }
}
