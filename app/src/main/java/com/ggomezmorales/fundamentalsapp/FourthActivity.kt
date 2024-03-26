package com.ggomezmorales.fundamentalsapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)

        val person = intent.getSerializableExtra("EXTRA_PERSON_DATA") as Person

        val viewData = findViewById<TextView>(R.id.dataPerson)
        viewData.text = person.toString()
    }
}