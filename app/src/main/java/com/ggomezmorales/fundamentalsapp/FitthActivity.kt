package com.ggomezmorales.fundamentalsapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class FitthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitth)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.miAddContant -> Toast.makeText(this, "Add Contant", Toast.LENGTH_SHORT).show()
            R.id.miFavorites -> Toast.makeText(this, "Favorites", Toast.LENGTH_SHORT).show()
            R.id.miSettings -> Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()
            R.id.miCloseApp -> finish()
            R.id.miFeedback -> Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}