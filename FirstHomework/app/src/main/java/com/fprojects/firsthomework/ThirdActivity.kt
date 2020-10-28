package com.fprojects.firsthomework

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        thirdActBtnNext.setOnClickListener { v ->
            val mainActivity = Intent(this, MainActivity::class.java)
            mainActivity.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(mainActivity)
        }

        thirdActBtnPrev.setOnClickListener { v ->
            val secondActivity = Intent(this, SecondActivity::class.java)
            startActivity(secondActivity)
        }
    }
}