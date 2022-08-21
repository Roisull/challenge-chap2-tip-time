package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.RadioButton

class TipTimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_time)

        // remove action bar
        supportActionBar?.hide()

        // FullScreen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val rbServiceAmazing: RadioButton = findViewById(R.id.rb_serviceAmazing)
        val rbServiceGood: RadioButton = findViewById(R.id.rb_serviceGood)
        val rbServiceOk: RadioButton = findViewById(R.id.rb_serviceOk)


        rbServiceAmazing.setOnClickListener(View.OnClickListener {
            it.isActivated

            rbServiceGood.isChecked = false
            rbServiceOk.isChecked = false
        })

        rbServiceGood.setOnClickListener(View.OnClickListener {
            it.isActivated

            rbServiceAmazing.isChecked = false
            rbServiceOk.isChecked = false
        })

        rbServiceOk.setOnClickListener(View.OnClickListener {
            it.isActivated

            rbServiceAmazing.isChecked = false
            rbServiceGood.isChecked = false
        })
    }
}