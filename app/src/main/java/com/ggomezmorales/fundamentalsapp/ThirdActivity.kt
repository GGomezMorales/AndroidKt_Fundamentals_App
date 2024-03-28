package com.ggomezmorales.fundamentalsapp

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class ThirdActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val buttonRequestPermissions = findViewById<Button>(R.id.buttonRequestPermissions)
        buttonRequestPermissions.setOnClickListener {
            requestPermissions()
        }

        val buttonMenu = findViewById<Button>(R.id.buttonMenu)
        buttonMenu.setOnClickListener {
            Intent(this, FitthActivity::class.java).also {
                startActivity(it)
            }
        }

    }

    private fun hasWriteExternalStoragePermission() =
        ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
    private fun hasLocationForegroundPermission() =
        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
    @RequiresApi(Build.VERSION_CODES.Q)
    private fun hasLocationBackgroundPermission() =
        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_BACKGROUND_LOCATION) == PackageManager.PERMISSION_GRANTED

    @RequiresApi(Build.VERSION_CODES.Q)
    private fun requestPermissions() {
        val permissionToRequest = mutableListOf<String>()
        if (!hasWriteExternalStoragePermission()) {
            permissionToRequest.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if (!hasLocationForegroundPermission()) {
            permissionToRequest.add(Manifest.permission.ACCESS_COARSE_LOCATION)
        }
        if (!hasLocationBackgroundPermission()) {
            permissionToRequest.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
        }
        if (permissionToRequest.isNotEmpty()) {
            ActivityCompat.requestPermissions(this, permissionToRequest.toTypedArray(), 0)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 0 && grantResults.isNotEmpty()) {
            for (i in grantResults.indices) {
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    Log.d("PermissionsRequest", "$permissions[i] granted" )
                }
            }
        }
    }
}
