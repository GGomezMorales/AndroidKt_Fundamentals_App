package com.ggomezmorales.fundamentalsapp

import android.content.ContentValues.TAG
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val buttonApply = findViewById<Button>(R.id.buttonApply)
        val textFirstName = findViewById<TextView>(R.id.textFirstName)
        val textLastName = findViewById<TextView>(R.id.textLastName)
        val textBirthday = findViewById<TextView>(R.id.textBirthday)
        textBirthday.inputType = InputType.TYPE_CLASS_DATETIME
        val textCountry = findViewById<TextView>(R.id.textCountry)

        buttonApply.setOnClickListener {
            val firstName = textFirstName.text.toString()
            val lastName = textLastName.text.toString()
            val birthday = textBirthday.text.toString()
            val country = textCountry.text.toString()
        }

        var count: Int = 0
        val textCount = findViewById<TextView>(R.id.textCount)
        val buttonCount = findViewById<Button>(R.id.buttonCount)
        buttonCount.setOnClickListener {
            count++
            textCount.text = "Let's count together: ${count}"
            Toast.makeText(this, "Update counter", Toast.LENGTH_SHORT).show()

            val clToast = layoutInflater.inflate(R.layout.custom_toast, null)
            Toast(this).apply {
                duration = Toast.LENGTH_SHORT
                view = clToast
                show()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }


    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

}

