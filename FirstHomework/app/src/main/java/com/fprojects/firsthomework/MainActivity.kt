package com.fprojects.firsthomework

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstActBtnNext.setOnClickListener { v ->
            val secondActivity = Intent(this, SecondActivity::class.java)
            startActivity(secondActivity)
        }

        firstActBtnPrev.setOnClickListener { v ->
            val thirdActivity = Intent(this, ThirdActivity::class.java)
            startActivity(thirdActivity)
        }
    }
}