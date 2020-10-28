package com.fprojects.firsthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        secondActBtnNext.setOnClickListener { v ->
            val thirdActivity = Intent(this, ThirdActivity::class.java)
            startActivity(thirdActivity)
        }

        secondActBtnPrev.setOnClickListener { v ->
            val mainActivity = Intent(this, MainActivity::class.java)
            mainActivity.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(mainActivity)
        }

    }
}