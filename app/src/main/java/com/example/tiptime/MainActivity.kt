package com.example.tiptime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // remove action bar
        supportActionBar?.hide()

        // FullScreen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        Handler().postDelayed({
                              startActivity(Intent(this,TipTimeActivity::class.java))
                              finish()
        },4000)

        val skipSplash: TextView = findViewById(R.id.tv_skipSplash)

        skipSplash.setOnClickListener{
            startActivity(Intent(this,TipTimeActivity::class.java))
        }
    }
}