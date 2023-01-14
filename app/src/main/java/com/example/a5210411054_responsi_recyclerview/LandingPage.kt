package com.example.a5210411054_responsi_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

private val waktu_loading = 1500

//4000=4 detik
class LandingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        supportActionBar?.hide()

        Handler().postDelayed({ //setelah loading maka akan langsung berpindah ke home activity
            val home = Intent(this, MainActivity::class.java)
            startActivity(home)
            finish()
        }, waktu_loading.toLong())
    }
}