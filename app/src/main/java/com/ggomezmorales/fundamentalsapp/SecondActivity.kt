package com.ggomezmorales.fundamentalsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener {
            finish()
//            Intent(this, MainActivity::class.java).also {
//                startActivity(it)
//            }
        }
        val buttonNextActivity = findViewById<Button>(R.id.buttonNextActivity)
        buttonNextActivity.setOnClickListener {
            Intent(this, ThirdActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}